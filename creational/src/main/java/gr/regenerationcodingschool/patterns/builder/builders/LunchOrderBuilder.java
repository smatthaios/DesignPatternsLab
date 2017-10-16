package gr.regenerationcodingschool.patterns.builder.builders;

import gr.regenerationcodingschool.patterns.builder.LunchOrder;

public final class LunchOrderBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrderBuilder() {
    }

    public static LunchOrderBuilder getLunchOrderBuilder() {
        return new LunchOrderBuilder();
    }

    public LunchOrderBuilder withBread(String bread) {
        this.bread = bread;
        return this;
    }

    public LunchOrderBuilder withCondiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public LunchOrderBuilder withDressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public LunchOrderBuilder withMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public LunchOrder build() {
        LunchOrder lunchOrder = new LunchOrder();
        lunchOrder.setBread(bread);
        lunchOrder.setCondiments(condiments);
        lunchOrder.setDressing(dressing);
        lunchOrder.setMeat(meat);
        return lunchOrder;
    }
}
