package gr.regenerationcodingschool.exercises.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderClient.class);

    public static void main(String args[]) {
        User user = new User();
        LOGGER.info(user.toString());
    }


}
