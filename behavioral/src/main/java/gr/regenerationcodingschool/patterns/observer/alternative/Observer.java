package gr.regenerationcodingschool.patterns.observer.alternative;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
