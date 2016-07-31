
public class Main {

	public static void main(String[] args) {
		
		Pizza kebabPizza = new KebabPizza();
		Pizza veggiePizza = new VeggiePizza();
		
		// Will contain all the ingredients.
		kebabPizza.makePizza();
		
		// Will not contain any meat.
		veggiePizza.makePizza();
	}

}
