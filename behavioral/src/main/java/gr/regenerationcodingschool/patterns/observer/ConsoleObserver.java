package gr.regenerationcodingschool.patterns.observer;

import java.util.Observable;
import java.util.Observer;

//concrete observer
class ConsoleObserver implements Observer {
    private String name;

    ConsoleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        TwitterStreamSubject twitterStreamSubject = (TwitterStreamSubject)o;
        System.out.println("Update " + name + "'s stream, someone tweeted: " + twitterStreamSubject.getTweetMessage());
    }
}