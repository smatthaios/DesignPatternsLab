package gr.regenerationcodingschool.exercises.pizzaStore.pizzas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

abstract public class Pizza {
    private static final Logger LOGGER = LoggerFactory.getLogger(Pizza.class);

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        LOGGER.info("Preparing " + name);
    }

    public void bake() {
        LOGGER.info("Baking " + name);
    }

    public void cut() {
        LOGGER.info("Cutting " + name);
    }

    public void box() {
        LOGGER.info("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
