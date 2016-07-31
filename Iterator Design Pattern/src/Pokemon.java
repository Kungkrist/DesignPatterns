
public class Pokemon {
	private String pokemonName, attackType;
	private int level;
	
	/**
	 * Create a pokemon.
	 * @param pokemonName - name of the pokemon.
	 * @param attackType - attack type of the pokemon.
	 * @param level - level of the pokemon.
	 */
	public Pokemon(String pokemonName, String attackType, int level) {
		this.setPokemonName(pokemonName);
		this.setAttackType(attackType);
		this.setLevel(level);
	}

	/**
	 * 
	 * @return the pokemon's name.
	 */
	public String getPokemonName() {
		return pokemonName;
	}

	private void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	/**
	 * 
	 * @return the pokemon's attack type.
	 */
	public String getAttackType() {
		return attackType;
	}

	private void setAttackType(String attackType) {
		this.attackType = attackType;
	}

	/**
	 * 
	 * @return the pokemon's level.
	 */
	public int getLevel() {
		return level;
	}

	private void setLevel(int level) {
		this.level = level;
	}
}
