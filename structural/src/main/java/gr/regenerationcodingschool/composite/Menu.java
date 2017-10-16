package gr.regenerationcodingschool.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
	String name;
	String url;
	protected List<Menu> childMenuComponents = new ArrayList<>();
	
	public Menu add(Menu menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	public Menu remove(Menu menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	public List<Menu> getChildMenuComponents() {
        throw new UnsupportedOperationException("Feature not implemented at this level");
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}	
	
	public abstract String toString();
	
	String print(Menu menuComponent) {
		StringBuilder builder = new StringBuilder(menuComponent.getName());
		builder.append(": ");
		builder.append(menuComponent.getUrl());
		builder.append("\n");
		return builder.toString();
	}
}
