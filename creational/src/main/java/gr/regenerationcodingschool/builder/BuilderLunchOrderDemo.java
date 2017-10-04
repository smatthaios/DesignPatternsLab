package gr.regenerationcodingschool.builder;

public class BuilderLunchOrderDemo {

	public static void main(String args[]) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();

		/*LunchOrder lunchOrder = builder
				.withBread("Wheat")
				.withDressing("Mayo")
				.withMeat("Turkey")
				.build();*/

        LunchOrder.Builder lunchOrderBuilder = builder.withBread("Wheat");
        lunchOrderBuilder = builder.withDressing("Mayo");
        lunchOrderBuilder = builder.withMeat("Turkey");
        lunchOrderBuilder = builder.withCondiments("Curry");

        LunchOrder lunchOrder = lunchOrderBuilder.build();
		System.out.println(lunchOrder);
	}
}
