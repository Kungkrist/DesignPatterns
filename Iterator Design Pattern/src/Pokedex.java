import java.util.Iterator;

public class Pokedex {
	private IPokemonIterator firePokemons;
	private IPokemonIterator waterPokemons;
	private IPokemonIterator grassPokemons;
	
	public Pokedex(IPokemonIterator firePokemons, IPokemonIterator waterPokemons, IPokemonIterator grassPokemons) {
		this.firePokemons = firePokemons;
		this.waterPokemons = waterPokemons;
		this.grassPokemons = grassPokemons;
	}
	
	/**
	 * Print all the pokemons to the console.
	 */
	public void printAllPokemons() {
		/*
		 * Send in an iterator as argument (using the IPokemonIterator-interface).
		 */
		printPokemons(this.firePokemons.createIterator());
		printPokemons(this.waterPokemons.createIterator());
		printPokemons(this.grassPokemons.createIterator());		
	}
	
	/**
	 * Iterate through and print the pokemons from a list to the console.
	 * @param iterator - the iterator from the pokemon-list.
	 */
	public void printPokemons(Iterator<Pokemon> iterator) {
		while(iterator.hasNext()) {
			Pokemon pokemon = (Pokemon) iterator.next();
			System.out.println(pokemon.getPokemonName() + ", " 
					+ pokemon.getAttackType() + ", " 
					+ pokemon.getLevel());
		}
	}

}
