
public class EnemyShip {
	private String name;
	
	public EnemyShip(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void rollForward() {
		System.out.println(name + " is rolling forward!");
	}
	
	public void canonShot() {
		System.out.println(name + " just fired a canon shot!");
	}
	
	public void parry() {
		System.out.println(name + " took half damage because of armor!");
	}
}
