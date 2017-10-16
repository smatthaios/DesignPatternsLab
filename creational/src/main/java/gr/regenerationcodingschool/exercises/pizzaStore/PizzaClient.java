package gr.regenerationcodingschool.exercises.pizzaStore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzaClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaClient.class);

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        LOGGER.info("We ordered a " + pizza.getName() + "\n");
        LOGGER.info(pizza.toString());
    }
}
