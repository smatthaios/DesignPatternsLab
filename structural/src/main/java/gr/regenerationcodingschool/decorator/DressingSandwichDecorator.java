package gr.regenerationcodingschool.decorator;

public class DressingSandwichDecorator extends SandwichDecorator {

	public DressingSandwichDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addDressing();
	}
	
	private String addDressing() {
		return " + mustard";
	}
	
}
