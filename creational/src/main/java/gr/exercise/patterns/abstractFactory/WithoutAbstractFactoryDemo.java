package gr.exercise.patterns.abstractFactory;

import gr.exercise.patterns.abstractFactory.card.*;
import gr.exercise.patterns.abstractFactory.factory.CardType;

//Messy program
public class WithoutAbstractFactoryDemo {
    public static void main(String args[]) {

        int creditScore = 550;
        CardType cardType = CardType.PLATINUM;
        int salary = 1500;
        CreditCard resultCard = null;

        if (creditScore > 650) {
            //Amex
            switch (cardType) {
                case GOLD:
                    resultCard = new AmexGoldCreditCard();

                case PLATINUM:
                    resultCard = new AmexPlatinumCreditCard();

                default:
                    resultCard = null;
                    break;
            }
        } else if (salary > 2500) {
            //Visa
            switch (cardType) {
                case GOLD:
                    resultCard = new VisaGoldCreditCard();
                    break;

                case PLATINUM:
                    resultCard = new VisaBlackCreditCard();
                    break;

                default:
                    resultCard = null;
                    break;
            }
        } else {
            //American Express
           /* switch (cardType) {
                case GOLD:
                    resultCard = new AmericanExpressGoldCreditCard();
                    break;

                case PLATINUM:
                    resultCard = new AmericanExpressPlatinumCreditCard();
                    break;

                default:
                    resultCard = null;
                    break;
            }*/
        }

        System.out.println(resultCard);

    }
}
