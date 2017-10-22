package gr.regenerationcodingschool.patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StateDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(StateDemo.class);

    public static void main(String[] args) {
        Fan fan = new Fan();
        //LOGGER.info(fan.toString());

        fan.pullChain();
        //LOGGER.info(fan.toString());

        fan.pullChain();
        //LOGGER.info(fan.toString());

        fan.pullChain();
        //LOGGER.info(fan.toString());

        fan.pullChain();
        //LOGGER.info(fan.toString());
    }
}
