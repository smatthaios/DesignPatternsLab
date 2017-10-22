package gr.regenerationcodingschool.patterns.observer.twitterObserver;

import java.util.Observable;
import java.util.Observer;

//concrete observer
class ClientObserver implements Observer {
    private String name;

    ClientObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}