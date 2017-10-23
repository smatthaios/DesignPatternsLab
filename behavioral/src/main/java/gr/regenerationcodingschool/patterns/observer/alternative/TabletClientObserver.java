package gr.regenerationcodingschool.patterns.observer.alternative;

public class TabletClientObserver extends Observer {

	public TabletClientObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from tablet");
	}
	
	@Override
	void update() {
		System.out.println("Tablet Stream: " + subject.getState());
	}

}
