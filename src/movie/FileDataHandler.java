package movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDataHandler {

	final ArrayList<Movie> movieList=new ArrayList<Movie>();
	
	public void readFileData() {
		File file=new File("C:\\Users\\darwante\\Documents\\Javapractice\\MovieReviews\\src\\data\\movieData");
		Scanner scan=null;
		
		try {
			scan=new Scanner(file);
			for (int i = 1; i <4; i++) {
				
				String[] movieData=scan.nextLine().split(",");
				int rating = Integer.parseInt(movieData[0]);
				String movieName=movieData[1];
				Movie movie=new Movie(rating, movieName);
				movieList.add(movie);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
		
		
		
	}
	
	
	public void displyMovieData() {
		for (int j = 0; j <movieList.size(); j++) {
			System.out.println(movieList.get(j).getMovieRating()+" " +movieList.get(j).getMovieName());	
			//System.out.println();
		}
		
	}
}
