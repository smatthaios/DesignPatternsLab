package gr.exercise.composite;

import java.util.List;

public class MenuComposite extends Menu {
	
	public MenuComposite(String name, String url) {
		this.name = name;
		this.url = url;
	}

    //Implemented only to Composite Nodes
	@Override
	public Menu add(Menu menuComponent) {
        getChildMenuComponents().add(menuComponent);
		return menuComponent;
	}

    //Implemented only to Composite Nodes
	@Override
	public Menu remove(Menu menuComponent) {
        getChildMenuComponents().remove(menuComponent);
		return menuComponent;
	}

    //Implemented only to Composite Nodes
	@Override
    public List<Menu> getChildMenuComponents() {
        return this.childMenuComponents;
	}

	//Common Operation - Both Leaf and Composite have it
	@Override
	public String toString() {
		//Remember? Builder pattern
		StringBuilder builder = new StringBuilder();
		
		builder.append(print(this));

		for (Menu menuComponent : getChildMenuComponents()) {
			builder.append(menuComponent.toString());
		}
		
		return builder.toString();
	}
}
