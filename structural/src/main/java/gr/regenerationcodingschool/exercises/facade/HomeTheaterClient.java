package gr.regenerationcodingschool.exercises.facade;

public class HomeTheaterClient {
	public static void main(String[] args) {
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner");
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player");
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player");
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		Screen screen = new Screen("Theater Screen");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(tuner, dvd, cd, projector, screen);
 
		homeTheater.playMovie("Raiders of the Lost Ark");
		homeTheater.stopMovie();
	}
}
