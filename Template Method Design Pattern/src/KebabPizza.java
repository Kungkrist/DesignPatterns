/**
 * This is a kebab pizza and it contains all the ingredients, but some of the is specified.
 * @author iths
 *
 */
public class KebabPizza extends Pizza{

	@Override
	public void addCheese() {
		System.out.println("Adding cheese.");
		
	}

	@Override
	public void addMeat() {
		System.out.println("Adding kebab.");
		
	}

	@Override
	public void addVegetables() {
		System.out.println("Adding some vegetables.");
		
	}

	@Override
	public void addSauce() {
		System.out.println("Adding kebab sauce.");
		
	}

	@Override
	public void addDough() {
		System.out.println("Adding dough");		
	}

}
