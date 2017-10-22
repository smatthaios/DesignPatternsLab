package gr.regenerationcodingschool.patterns.observer;

public class ObserverDemo {

	public static void main(String args[]) {
		Subject subject = new MessageStreamSubject();
		
		PhoneClientObserver phoneClientObserver = new PhoneClientObserver(subject);
		TabletClientObserver tabletClientObserver = new TabletClientObserver(subject);
		
		phoneClientObserver.addMessage("Here is a new message!");
		tabletClientObserver.addMessage("Another new message!");
	}
}
