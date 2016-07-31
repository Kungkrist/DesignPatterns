
public class Movie extends MovieComponent {
	private String movieName, directorName;		// Movie name & director name.
	private int releaseDate;					// The release date.
	
	/**
	 * 
	 * @param movieName - name of the movie.
	 * @param directorName - name of the director who directed this movie.
	 * @param releaseDate - the date when the movie was released.
	 */
	public Movie(String movieName, String directorName, int releaseDate) {
		this.setMovieName(movieName);
		this.setDirectorName(directorName);
		this.setReleaseDate(releaseDate);
	}
	

	@Override
	public String getDirectorName() {
		return directorName;
	}

	/*
	 * Set the name of the director.
	 */
	private void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	@Override
	public int getReleaseDate() {
		return releaseDate;
	}

	/*
	 * Set the release date.
	 */
	private void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String getMovieName() {
		return movieName;
	}

	/*
	 * Set the movie name.
	 */
	private void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public void info() {
		
		// Print movie info.
		System.out.println("movie name: " + getMovieName() 
			+ ", director: " + getDirectorName() 
			+ ", release date: " 
			+ getReleaseDate());
	}
}
