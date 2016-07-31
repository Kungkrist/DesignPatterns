/**
 * Used as an interface for either a group of movies or a movie.
 * If the child-class does not Override a method in here and 
 * that method is used, it will throw a UnsupportedOperationException.
 * @author iths
 *
 */
public abstract class MovieComponent {
	
	/**
	 * Add a new movie.
	 * Throws UnsupportedOperationException if the method is not override.
	 * @param movieComponent - a movie.
	 */
	public void add(MovieComponent movieComponent) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Remove a existing movie.
	 * Throws UnsupportedOperationException if the method is not override.
	 * @param movieComponent - a movie.
	 */
	public void remove(MovieComponent  movieComponent) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Throws UnsupportedOperationException if the method is not override.
	 * @param index - the movie's index path.
	 * @return the specified movie.
	 */
	public MovieComponent getComponent(int index) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Throws UnsupportedOperationException if the method is not override.
	 * @return the movie name.
	 */
	public String getMovieName() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Throws UnsupportedOperationException if the method is not override.
	 * @return  name of the director.
	 */
	public String getDirectorName() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Throws UnsupportedOperationException if the method is not override.
	 * @return the movie's release date.
	 */
	public int getReleaseDate() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Throws UnsupportedOperationException if the method is not override.
	 * @return info about the movie.
	 */
	public void info() {
		throw new UnsupportedOperationException();
	}

}
