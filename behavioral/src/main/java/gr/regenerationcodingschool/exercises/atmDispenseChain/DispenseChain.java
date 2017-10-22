package gr.regenerationcodingschool.exercises.atmDispenseChain;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}