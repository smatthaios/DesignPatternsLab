package gr.exercise.flyweight;

import java.util.HashMap;
import java.util.Map;

//Registry acts as a factory and cache for Item flyweight objects
public class Registry {
	private Map<String, Item> items = new HashMap<>();

	//factory method
	public Item lookup(String itemName) {
		if (!items.containsKey(itemName))
			items.put(itemName, new Item(itemName));
		return items.get(itemName);
	}

	public int totalItemsMade() {
		return items.size();
	}
}