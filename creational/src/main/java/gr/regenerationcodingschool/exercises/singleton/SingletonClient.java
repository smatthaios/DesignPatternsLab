package gr.regenerationcodingschool.exercises.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonClient.class);

    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance();
        LOGGER.info(singleton.toString());
        LOGGER.info(singleton.getDescription());

        Singleton singleton2 = Singleton.getInstance();
        LOGGER.info(singleton2.toString());
        LOGGER.info(singleton.getDescription());

    }
}
