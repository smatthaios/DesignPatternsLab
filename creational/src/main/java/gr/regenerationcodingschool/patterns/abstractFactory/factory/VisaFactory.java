package gr.regenerationcodingschool.patterns.abstractFactory.factory;

import gr.regenerationcodingschool.patterns.abstractFactory.card.CreditCard;
import gr.regenerationcodingschool.patterns.abstractFactory.card.VisaBlackCreditCard;
import gr.regenerationcodingschool.patterns.abstractFactory.card.VisaGoldCreditCard;
import gr.regenerationcodingschool.patterns.abstractFactory.validator.Validator;
import gr.regenerationcodingschool.patterns.abstractFactory.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:

                return new VisaGoldCreditCard();

            case PLATINUM:

                return new VisaBlackCreditCard();

        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
