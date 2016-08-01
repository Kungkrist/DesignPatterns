
public class EnemyDragonAdapter implements EnemyAttacker{
	
	EnemyDragon dragon;

	/**
	 * Takes in an EnemyDragon and converts it to the EnemyAttacker interface.
	 * @param dragon - the enemy.
	 */
	public EnemyDragonAdapter(EnemyDragon dragon) {
		this.dragon = dragon;
	}
	
	@Override
	public void moveForward() {
		dragon.fly();
	}

	@Override
	public void attack() {
		dragon.wingAttack();		
	}

	@Override
	public void parry() {
		dragon.wingShield();		
	}
}
