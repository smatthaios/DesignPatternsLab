package gr.regenerationcodingschool.patterns.observer.twitterObserver;

import java.util.Observable;

// concrete subject
class TwitterStreamSubject extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}