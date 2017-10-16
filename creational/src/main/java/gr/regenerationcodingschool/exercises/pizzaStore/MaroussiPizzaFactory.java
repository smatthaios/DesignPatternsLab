package gr.regenerationcodingschool.exercises.pizzaStore;

public class MaroussiPizzaFactory {

    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}