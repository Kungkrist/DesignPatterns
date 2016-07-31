/**
 * Enemy types (not a part of the Factory pattern).
 * @author iths
 *
 */
enum EnemyType {
	DRAGON(1), SHIP(2);
	private final int value;
	private EnemyType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

/**
 * Used to generate enemies.
 * @author iths
 *
 */
public class EnemyFactory {
	
	/**
	 * Create a new enemy.
	 * @param enemyName - name of the enemy.
	 * @param typeOfEnemy - type of the enemy (ex, EnemyType.DRAGON).
	 * @return a new enemy.
	 */
	public Enemy createEnemy(String enemyName, EnemyType typeOfEnemy) {
		return generateEnemy(enemyName, typeOfEnemy.getValue());
	}
	
	/**
	 * Create a new enemy
	 * @param enemyName - name of the enemy.
	 * @param typeOfEnemy - type of the enemy (ex, 1 = dragon).
	 * @return a new enemy.
	 */
	public Enemy createEnemy(String enemyName, int typeOfEnemy) {
		return generateEnemy(enemyName, typeOfEnemy);
	}
	
	/**
	 * Generate a new enemy by type.
	 * @param enemyName - name of the enemy.
	 * @param value - enemy type (int).
	 * @return a new enemy.
	 */
	private Enemy generateEnemy(String enemyName, int value) {
		switch(value) {
			case 1: return new EnemyDragon(enemyName);
			case 2: return new EnemyShip(enemyName);
			default: return null;			
		}
	}
}
