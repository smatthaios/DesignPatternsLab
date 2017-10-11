package gr.regenerationcodingschool.abstractFactory.factory;

import gr.regenerationcodingschool.abstractFactory.card.CreditCard;
import gr.regenerationcodingschool.abstractFactory.validator.Validator;

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
