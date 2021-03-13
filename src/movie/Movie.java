package movie;

public class Movie {

		int movieRating;
		String MovieName;
		
		public int getMovieRating() {
			return movieRating;
		}
		
		public void setMovieRating(int movieRating) {
			this.movieRating = movieRating;
		}
		public String getMovieName() {
			return MovieName;
		}
		public void setMovieName(String movieName) {
			MovieName = movieName;
		}
		
		public Movie(int movieRating, String movieName) {
			super();
			this.movieRating = movieRating;
			MovieName = movieName;
		}
		
		
	
}
