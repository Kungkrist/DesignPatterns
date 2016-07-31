/**
 * This is a veggie pizza and shall not contain any meat.
 * @author iths
 *
 */
public class VeggiePizza extends Pizza{
	
	@Override
	public boolean hasMeat() {
		return false;
	}

	@Override
	public void addCheese() {
		System.out.println("Adding cheese.");
		
	}

	@Override
	public void addMeat() {
		// Do nothing.		
	}

	@Override
	public void addVegetables() {
		System.out.println("Adding many vegetables.");
		
	}

	@Override
	public void addSauce() {
		System.out.println("Adding sauce.");
		
	}

	@Override
	public void addDough() {
		System.out.println("Adding dough");
		
	}

}
