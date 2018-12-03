package gr.exercise.exercises.pizzaStore;

import gr.exercise.exercises.pizzaStore.pizzas.ChalandriCheesePizza;
import gr.exercise.exercises.pizzaStore.pizzas.ChalandriGreekPizza;
import gr.exercise.exercises.pizzaStore.pizzas.ChalandriPepperoniPizza;
import gr.exercise.exercises.pizzaStore.pizzas.Pizza;

public class ChalandriPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        // Creation of Pizza
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new ChalandriCheesePizza();
        } else if (type.equals(PizzaType.GREEK)) {
            pizza = new ChalandriGreekPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new ChalandriPepperoniPizza();
        }
        return pizza;
    }
}