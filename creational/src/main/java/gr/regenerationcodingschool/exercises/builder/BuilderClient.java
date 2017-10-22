package gr.regenerationcodingschool.exercises.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderClient.class);

    public static void main(String args[]) {
        UserBuilder userBuilder = UserBuilder.getUserBuilder("Stelios", "Matthaios");
        User user = userBuilder.withAge(30)
                .build();

        LOGGER.info(user.toString());
    }
}
