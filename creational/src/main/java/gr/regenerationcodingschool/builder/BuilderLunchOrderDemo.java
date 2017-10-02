package gr.regenerationcodingschool.builder;

public class BuilderLunchOrderDemo {

	public static void main(String args[]) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder("Curry");

		LunchOrder lunchOrder = builder
				.withBread("Wheat")
				.withDressing("Mayo")
				.withMeat("Turkey")
				.build();
		
		System.out.println(lunchOrder);
	}
}
