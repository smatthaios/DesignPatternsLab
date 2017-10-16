package gr.regenerationcodingschool.exercises.pizzaStore;

import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.MaroussiCheesePizza;
import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.MaroussiGreekPizza;
import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.MaroussiPepperoniPizza;
import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.Pizza;

public class MaroussiPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        // Creation of Pizza
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new MaroussiCheesePizza();
        } else if (type.equals(PizzaType.GREEK)) {
            pizza = new MaroussiGreekPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new MaroussiPepperoniPizza();
        }
        return pizza;
    }
}