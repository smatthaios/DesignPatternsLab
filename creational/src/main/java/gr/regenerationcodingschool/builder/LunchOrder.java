package gr.regenerationcodingschool.builder;

public class LunchOrder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrder(LunchOrder.Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public LunchOrder() {
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        //Make condiments mandatory
        public Builder(/*String condiments*/) {
            /*this.condiments = condiments;*/
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder withBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder withCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder withDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder withMeat(String meat) {
            this.meat = meat;
            return this;
        }

    }

}
