package gr.regenerationcodingschool.decorator;

public class MeatSandwichDecorator extends SandwichDecorator {

	public MeatSandwichDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addMeat();
	}

	private String addMeat() {
		return " + turkey";
	}
}
