package gr.regenerationcodingschool.exercises.decorateCoffee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeClient.class);
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		LOGGER.info(beverage.getDescription() + " " + beverage.cost() + " euro");

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		LOGGER.info(beverage2.getDescription() + " " + beverage2.cost() + " euro");

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		LOGGER.info(beverage3.getDescription() + " " + beverage3.cost() + " euro");
	}
}
