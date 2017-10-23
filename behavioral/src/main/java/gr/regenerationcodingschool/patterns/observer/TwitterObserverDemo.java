package gr.regenerationcodingschool.patterns.observer;

public class TwitterObserverDemo {

    public static void main(String args[]) {
        // Concrete Subject
        TwitterStreamSubject messageStream = new TwitterStreamSubject();

        // Concrete Observers
        ConsoleObserver consoleObserver1 = new ConsoleObserver("Bryan");
        ConsoleObserver consoleObserver2 = new ConsoleObserver("Mark");

        messageStream.addObserver(consoleObserver1);
        messageStream.addObserver(consoleObserver2);

        messageStream.someoneTweeted("hello");
    }
}



