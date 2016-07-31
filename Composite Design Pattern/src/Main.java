
public class Main {

	public static void main(String[] args) {
		// Create an all movies group.
		MovieComponent allMovies = new MovieGroup("All the movies", "SHOW THEM ALL!");
		
		// Create a comedy group that will be put in allMovies.
		MovieComponent comedyMovies = new MovieGroup("Comedy", "They make you laugh");
		
		// Create a horror group that will be put in allMovies.
		MovieComponent horrorMovies = new MovieGroup("Horror", "Horror is tha shit!");
		
		// Create a supernatural group that will be put in horrorMovies.
		MovieComponent supernaturalMovies = new MovieGroup("Supernatural", "Movies about ghosts?");
		
		// Create a hack n slash group that will be put in horrorMovies.
		MovieComponent hackNSlashMovies = new MovieGroup("HackNSlash", "Don't kill me pleg.");
		
		/*
		 * Add the two groups to the horrorMovies group.
		 */
		horrorMovies.add(supernaturalMovies);
		horrorMovies.add(hackNSlashMovies);
		
		/*
		 * Add two movies to the supernatural group.
		 */
		supernaturalMovies.add(new Movie("Paranormal activity", "Unknown", 2011));
		supernaturalMovies.add(new Movie("Mystic fisk", "Bill Gates", 1994));
		
		// Add a movie to the hack n slash group.
		hackNSlashMovies.add(new Movie("Freddy vs Jason", "Dunno", 1996));
		
		// Add a movie to the comedy group.
		comedyMovies.add(new Movie("Dea tha man", "Andreas Hansson", 2016));
		
		/*
		 * Add the two groups to the all movies group.
		 */
		allMovies.add(horrorMovies);
		allMovies.add(comedyMovies);
		
		/*
		 * Create a movie handler and display all the movies & groups in a list.
		 */
		MovieHandler movieHandler = new MovieHandler(allMovies);
		movieHandler.getMovieList();
	}

}
