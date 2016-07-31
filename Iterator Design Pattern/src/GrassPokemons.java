import java.util.ArrayList;
import java.util.Iterator;

public class GrassPokemons implements IPokemonIterator{
	private ArrayList<Pokemon> grassPokemons;
	
	public GrassPokemons() {
		this.grassPokemons = new ArrayList<Pokemon>();
	}
	
	public void addPokemon(Pokemon pokemon) {
		this.grassPokemons.add(pokemon);
	}

	@Override
	public Iterator<Pokemon> createIterator() {
		return this.grassPokemons.iterator();
	}
}
