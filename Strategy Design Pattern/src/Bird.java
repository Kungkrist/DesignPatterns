
public class Bird extends Animal{

	public Bird(String name, String type) {
		super(name, type);
		
		// Used in the pattern-design. 
		super.setFlyingType(new ItCanFly());
	}

}
