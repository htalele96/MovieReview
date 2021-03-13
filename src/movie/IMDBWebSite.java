package movie;

public class IMDBWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileDataHandler fileData=new FileDataHandler();
		fileData.readFileData();
		fileData.displyMovieData();
	}

}
