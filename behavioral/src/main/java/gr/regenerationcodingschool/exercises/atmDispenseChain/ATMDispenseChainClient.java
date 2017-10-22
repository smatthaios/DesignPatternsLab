package gr.regenerationcodingschool.exercises.atmDispenseChain;

import java.util.Scanner;

public class ATMDispenseChainClient {
    private DispenseChain dispenseChain;

    private ATMDispenseChainClient() {
        // initialize the chain
        this.dispenseChain = new FiftyEuroDispenser();
        DispenseChain c2 = new TwentyEuroDispenser();
        DispenseChain c3 = new TenEuroDispenser();

        // set the chain of responsibility
        dispenseChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChainClient atmDispenser = new ATMDispenseChainClient();

        System.out.println("Enter amount to dispense");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
        } else {
            // process the request
            atmDispenser.dispenseChain.dispense(new Currency(amount));
        }

    }

}