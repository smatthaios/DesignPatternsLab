package gr.regenerationcodingschool.patterns.observer.alternative;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStreamSubject extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<>();
	
	@Override
	void setState(String message) {
		messageHistory.add(message);
		this.notifyObservers();
	}

	@Override
	String getState() {
		return messageHistory.getLast();
	}
}
