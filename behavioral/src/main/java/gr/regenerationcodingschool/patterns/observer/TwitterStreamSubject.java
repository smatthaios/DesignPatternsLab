package gr.regenerationcodingschool.patterns.observer;

import java.util.Observable;

// concrete subject
class TwitterStreamSubject extends Observable {
    private String tweetMessage;

    public void someoneTweeted(String msg) {
        this.tweetMessage = msg;

        setChanged();
        notifyObservers();
    }

    public String getTweetMessage() {
        return tweetMessage;
    }
}