
public class Main {

	public static void main(String[] args) {
		// Create a factory that generates enemies
		EnemyFactory factory = new EnemyFactory();
		
		// Generate a enemy dragon
		Enemy dragon = factory.createEnemy("Dragonite", EnemyType.DRAGON);
		
		// Generate a enemy ship
		Enemy ship = factory.createEnemy("Alien ship", EnemyType.SHIP);
		
		doStuff(dragon);
		doStuff(ship);

	}
	
	/**
	 * Just doing some random stuff.
	 * @param enemy - the enemy.
	 */
	public static void doStuff(Enemy enemy) {
		enemy.followHero();
		enemy.attack("Hero");
		enemy.takeDamage(110);
	}

}
