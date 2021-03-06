package gr.regenerationcodingschool.patterns.abstractFactory.factory;

import gr.regenerationcodingschool.patterns.abstractFactory.card.CreditCard;
import gr.regenerationcodingschool.patterns.abstractFactory.validator.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        //Refactor to is Amex eligible
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
