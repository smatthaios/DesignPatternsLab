package gr.regenerationcodingschool.exercises.facadeHomeTheatre;

public class CdPlayer {
	String description;
	int currentTrack;
	String title;
	
	public CdPlayer(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void eject() {
		title = null;
		System.out.println(description + " eject");
	}
 
	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		System.out.println(description + " playing \"" + title + "\"");
	}
 
	public String toString() {
		return description;
	}
}
