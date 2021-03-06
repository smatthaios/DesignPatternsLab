package gr.regenerationcodingschool.patterns.builder;

import gr.regenerationcodingschool.patterns.builder.builders.LunchOrderBuilder;

public class BuilderLunchOrderDemo {

    public static void main(String args[]) {

        LunchOrderBuilder builder = LunchOrderBuilder.getLunchOrderBuilder();

		/*LunchOrder lunchOrder = builder
                .withBread("Wheat")
				.withDressing("Mayo")
				.withMeat("Turkey")
				.build();*/

        LunchOrder lunchOrder = builder.withBread("Wheat")
                .withCondiments("Curry")
                .withDressing("Mayo")
                .withMeat("Turkey")
                .build();

        System.out.println(lunchOrder);
    }
}
