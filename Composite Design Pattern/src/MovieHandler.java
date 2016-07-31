
public class MovieHandler {
	private MovieComponent movieList;
	
	/**
	 * Handles a collection of movies.
	 * @param component - can either be a movie or a group of movies.
	 */
	public MovieHandler(MovieComponent component) {
		this.movieList = component;
	}
	
	/**
	 * Get info of all the movies & groups in this collection.
	 */
	public void getMovieList() {
		this.movieList.info();
	}

}
