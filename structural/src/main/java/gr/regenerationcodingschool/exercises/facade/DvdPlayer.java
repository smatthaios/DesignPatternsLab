package gr.regenerationcodingschool.exercises.facade;

public class DvdPlayer {
	String description;
	int currentTrack;
	String movie;
	
	public DvdPlayer(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

        public void eject() {
		movie = null;
                System.out.println(description + " eject");
        }
 
	public void play(String movie) {
		this.movie = movie;
		currentTrack = 0;
		System.out.println(description + " playing \"" + movie + "\"");
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " stopped \"" + movie + "\"");
	}
 
	public String toString() {
		return description;
	}
}
