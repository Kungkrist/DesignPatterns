
public class EnemyShipAdapter implements EnemyAttacker{
	private EnemyShip enemyShip;
	
	/**
	 * Takes in an EnemyShip and converts it to the EnemyAttacker interface.
	 * @param enemyShip - the enemy ship.
	 */
	public EnemyShipAdapter(EnemyShip enemyShip) {
		this.enemyShip = enemyShip;
	}

	@Override
	public void moveForward() {
		this.enemyShip.rollForward();
		
	}

	@Override
	public void attack() {
		this.enemyShip.canonShot();
		
	}

	@Override
	public void parry() {
		this.enemyShip.parry();		
	}
}
