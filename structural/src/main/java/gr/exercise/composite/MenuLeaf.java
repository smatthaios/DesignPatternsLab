package gr.exercise.composite;


public class MenuLeaf extends Menu {

	public MenuLeaf(String name, String url) {
		this.name = name;
		this.url = url;
	}

	//Common Operation - Both Leaf and Composite have it
	@Override
	public String toString() {
		return print(this);
	}
}
