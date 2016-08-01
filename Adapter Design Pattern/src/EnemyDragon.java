
public class EnemyDragon {
	private String name;
	
	public EnemyDragon(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public void wingAttack() {
		System.out.println(name + " did a wing attack!");
	}
	
	public void fly() {
		System.out.println(name + " is flying high!");
	}
	
	public void wingShield() {
		System.out.println(name + " parried with wings!");
	}
}
