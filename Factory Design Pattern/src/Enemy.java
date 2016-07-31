/**
 * This is the enemy super class.
 * @author iths
 *
 */
public class Enemy {
	private String name;
	private int damage;
	private int health;
	
	/**
	 * 
	 * @param name - name of the enemy.
	 * @param damage - the damage the enemy deals.
	 * @param health - the enemie's health.
	 */
	public Enemy(String name, int damage, int health) {
		this.name = name;
		this.damage = damage;
		this.health = health;
	}
	
	/**
	 * Used to attack the player.
	 * @param player - the player represented as a String (a fake player).
	 */
	public void attack(String player) {
		System.out.println(this.name + " attacked " + player 
				+ ", dealing: " + damage + " damage.");
	}
	
	/**
	 * Used to follow the hero.
	 */
	public void followHero() {
		System.out.println(this.name + " is folowing hero");
	}
	
	/**
	 * The enemy takes x-amount of damage.
	 * @param damage - the damage.
	 */
	public void takeDamage(int damage) {
		this.health -= damage;
		
		if(this.health <= 0) printEnemyDied();
	}
	
	/*
	 * Print that the enemy has died.
	 */
	private void printEnemyDied() {
		System.out.println(this.name + " died.");
	}
}
