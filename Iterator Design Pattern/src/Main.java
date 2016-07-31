
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Create the pokemon-list classes.
		 */
		FirePokemons firePokemons = new FirePokemons();
		WaterPokemons waterPokemons = new WaterPokemons();
		GrassPokemons grassPokemons = new GrassPokemons();
		
		/*
		 * Add the fire pokemons.
		 */
		firePokemons.addPokemon(new Pokemon("Charmander", "firebolt", 2));
		firePokemons.addPokemon(new Pokemon("Charmilion", "fireTail", 6));
		firePokemons.addPokemon(new Pokemon("Charzard", "fireclaw", 10));
		
		/*
		 * Add the water pokemons.
		 */
		waterPokemons.addPokemon(new Pokemon("Squirtle", "watergun", 1));
		waterPokemons.addPokemon(new Pokemon("Wartortle", "waterspinn", 8));
		waterPokemons.addPokemon(new Pokemon("Blastoise", "watercanon", 10));
		
		/*
		 * Add the grass pokemons.
		 */
		grassPokemons.addPokemon(new Pokemon("Bulbasaur", "whip", 3));
		grassPokemons.addPokemon(new Pokemon("Ivysaur", "whip", 3));
		grassPokemons.addPokemon(new Pokemon("Venusaur", "superwhip", 3));
		
		/*
		 * Create a pokedex and print all the pokemons to the console.
		 */
		Pokedex pokedex = new Pokedex(firePokemons, waterPokemons, grassPokemons);
		pokedex.printAllPokemons();

	}

}
