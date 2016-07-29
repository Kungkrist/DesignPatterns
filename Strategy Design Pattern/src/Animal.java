
public class Animal {

	private String name, type;
	private Flys flyingType; 		// Used in the pattern-design. 
	
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {return this.name;}
	
	public String getType() {return this.type;}	
	
	// Used in the pattern-design. 
	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	// Used in the pattern-design. 
	public String tryToFly() {
		return this.flyingType.itFlyes();
	}
	
	
}
