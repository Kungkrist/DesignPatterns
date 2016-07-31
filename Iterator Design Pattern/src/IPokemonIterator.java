import java.util.Iterator;

/**
 * This interface is used to generate an iterator from some kind of array or list.
 * @author iths
 *
 */
public interface IPokemonIterator {
	
	/**
	 * 
	 * @return an iterator of type Pokemon.
	 */
	public Iterator<Pokemon> createIterator();
}
