package gr.exercise.exercises.pizzaStore;

import gr.exercise.exercises.pizzaStore.pizzas.Pizza;

public abstract class AbstractPizzaFactory {

    //Abstract Factory method
    abstract Pizza createPizza(PizzaType type);

    Pizza orderPizza(PizzaType type) {
        // Creation of Pizza
        Pizza pizza = createPizza(type);

        // Preparation of Pizza
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static AbstractPizzaFactory getStoreFacrtory(StoreEnum store) {

        if (store.equals(StoreEnum.MAROUSSI)) {
            return new MaroussiPizzaFactory();
        } else {
            return new ChalandriPizzaFactory();
        }
    }

}
