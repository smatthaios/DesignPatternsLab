package gr.regenerationcodingschool.patterns.decorator;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
        ConcreteSandwich sandwich = new ConcreteSandwich();
        MeatSandwichDecorator meatSandwich = new MeatSandwichDecorator(sandwich);
        DressingSandwichDecorator dressingMeatSandwich = new DressingSandwichDecorator(meatSandwich);

		//Sandwich sandwich = new DressingSandwichDecorator(new MeatSandwichDecorator(new ConcreteSandwich()));
		
		System.out.println(dressingMeatSandwich.make());
	}
}
