package gr.regenerationcodingschool.patterns.observer.twitterObserver;

public class TwitterObserverDemo {

    public static void main(String args[]) {
        // Concrete Subject
        TwitterStreamSubject messageStream = new TwitterStreamSubject();

        // Concrete Observers
        ClientObserver clientObserver1 = new ClientObserver("Bryan");
        ClientObserver clientObserver2 = new ClientObserver("Mark");

        messageStream.addObserver(clientObserver1);
        messageStream.addObserver(clientObserver2);

        messageStream.someoneTweeted();
    }
}



