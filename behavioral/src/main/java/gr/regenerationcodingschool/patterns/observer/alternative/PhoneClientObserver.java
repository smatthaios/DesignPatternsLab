package gr.regenerationcodingschool.patterns.observer.alternative;

public class PhoneClientObserver extends Observer {

	public PhoneClientObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}
	
	@Override
	void update() {
		System.out.println("Phone Stream: " + subject.getState());
	}
}
