package gr.regenerationcodingschool.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
	
	private final Registry registry = new Registry();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	void takeOrder(String itemName, int orderNumber) {
		Item item = registry.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}

	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	String report() {
		return "\nTotal Item objects made: "
				+ registry.totalItemsMade();
	}
}