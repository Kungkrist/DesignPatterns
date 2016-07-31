import java.util.Arrays;
import java.util.Iterator;

public class WaterPokemons implements IPokemonIterator{
	private Pokemon[] waterPokemons;
	int index = 0;
	
	public WaterPokemons() {
		this.waterPokemons = new Pokemon[3]; 
	}
	
	public void addPokemon(Pokemon pokemon) {
		if(index < 3)
			waterPokemons[index++] = pokemon;
	}

	@Override
	public Iterator<Pokemon> createIterator() {
		return Arrays.asList(this.waterPokemons).iterator();
	}
}
