/**
 * This is an abstract class that works as a template.
 * @author iths
 *
 */
public abstract class Pizza {
	public Pizza() {}
	
	/**
	 * Adding the dough (leave empty if it shall not me added.)
	 */
	public abstract void addDough();
	
	/**
	 * Adding the cheese (leave empty if it shall not me added.)
	 */
	public abstract void addCheese();
	
	/**
	 * Adding the meat (leave empty if it shall not me added.)
	 */
	public abstract void addMeat();
	
	/**
	 * Adding the vegetables (leave empty if it shall not me added.)
	 */
	public abstract void addVegetables();
	
	/**
	 * Adding the sauce (leave empty if it shall not me added.)
	 */
	public abstract void addSauce();
	
	/**
	 * 
	 * @return true if cheese shall be added to the pizza.
	 */
	public boolean hasCheese() {
		return true;
	}
	
	/**
	 * 
	 * @return true if meat shall be added to the pizza.
	 */
	public boolean hasMeat() {
		return true;
	}
	
	/**
	 * 
	 * @return true if vegetables shall be added to the pizza.
	 */
	public boolean hasVegetables() {
		return true;
	}
	
	/**
	 * 
	 * @return true if sauce shall be added to the pizza.
	 */
	public boolean hasSauce() {
		return true;
	}
	
	/**
	 * Slice the pizza.
	 */
	public void slicePizza() {
		System.out.println("Slicing pizza");
	}
	
	/**
	 * Make the pizza.
	 * Will only add the selected items.
	 */
	public void makePizza() {
		// All pizzas has dough so it will always be added.
		addDough();
		
		/*
		 * Add ingredients if it shall be added.
		 */
		if(hasCheese()) addCheese();
		if(hasMeat()) addMeat();
		if(hasVegetables()) addVegetables();
		if(hasSauce()) addSauce();
		
		// Slice the pizza.
		slicePizza();
		System.out.println();
	}
	
}
