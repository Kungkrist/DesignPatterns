import java.util.HashMap;
import java.util.Iterator;

public class FirePokemons implements IPokemonIterator{
	private HashMap<Integer, Pokemon> firePokemons;
	private int index = 0;
	
	public FirePokemons() {
		this.firePokemons = new HashMap<Integer, Pokemon>();
	}
	
	public void addPokemon(Pokemon pokemon) {
		this.firePokemons.put(index++, pokemon);
	}

	@Override
	public Iterator<Pokemon> createIterator() {
		return this.firePokemons.values().iterator();
	}
}
