package gr.regenerationcodingschool.exercises.pizzaStore;

import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.ChalandriCheesePizza;
import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.ChalandriGreekPizza;
import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.ChalandriPepperoniPizza;
import gr.regenerationcodingschool.exercises.pizzaStore.pizzas.Pizza;

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