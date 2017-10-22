package gr.regenerationcodingschool.exercises.atmDispenseChain;

public class FiftyEuroDispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50 euro note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(cur);
        }
    }

}