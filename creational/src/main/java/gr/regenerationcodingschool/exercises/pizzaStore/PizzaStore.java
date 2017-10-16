package gr.regenerationcodingschool.exercises.pizzaStore;

public class PizzaStore {
    Pizza orderPizza(String type) {

        Pizza pizza = null;

        // Creation of Pizza
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        // Preparation of Pizza
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
