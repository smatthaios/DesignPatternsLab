package gr.exercise.exercises.pizzaStore;

import gr.exercise.exercises.pizzaStore.pizzas.MaroussiCheesePizza;
import gr.exercise.exercises.pizzaStore.pizzas.MaroussiPepperoniPizza;
import gr.exercise.exercises.pizzaStore.pizzas.Pizza;
import gr.exercise.exercises.pizzaStore.pizzas.MaroussiGreekPizza;

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