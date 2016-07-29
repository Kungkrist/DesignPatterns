
public class Dog extends Animal{

	public Dog(String name, String type) {
		super(name, type);
		
		// Used in the pattern-design. 
		super.setFlyingType(new ItCannotFly());
	}

}
