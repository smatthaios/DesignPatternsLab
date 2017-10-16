package gr.regenerationcodingschool.exercises.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonClient.class);

    public static void main(String args[]) {
        Singleton singleton = new Singleton();
        LOGGER.info(singleton.toString());

        Singleton singleton2 = new Singleton();
        LOGGER.info(singleton2.toString());

    }
}
