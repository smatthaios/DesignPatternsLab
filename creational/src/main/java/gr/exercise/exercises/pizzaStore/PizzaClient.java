package gr.exercise.exercises.pizzaStore;

import gr.exercise.exercises.pizzaStore.pizzas.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzaClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaClient.class);

    public static void main(String[] args) {
        AbstractPizzaFactory maroussiSttore = AbstractPizzaFactory.getStoreFacrtory(StoreEnum.MAROUSSI);

        Pizza pizza = maroussiSttore.orderPizza(PizzaType.GREEK);
        LOGGER.info("We ordered a " + pizza.getName() + "\n");
        LOGGER.info(pizza.toString());
    }
}
