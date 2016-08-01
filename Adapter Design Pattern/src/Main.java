
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Creating the enemies.
		 */
		EnemyDragon dragon = new EnemyDragon("Dragonite");
		EnemyShip ship = new EnemyShip("Alien ship");
		
		/*
		 * Creating the enemy adapters.
		 */
		EnemyDragonAdapter dragonAdapter = new EnemyDragonAdapter(dragon);
		EnemyShipAdapter shipAdapter = new EnemyShipAdapter(ship);
		
		/*
		 * Call the same method for both adapters.
		 */
		doStuff(dragonAdapter);
		doStuff(shipAdapter);

	}
	
	/**
	 * Does random stuff with an enemy attacker.
	 * @param attacker - Class that implements the EnemyAttacker interface.
	 */
	public static void doStuff(EnemyAttacker attacker) {
		attacker.attack();
		attacker.parry();
		attacker.moveForward();
	}

}
