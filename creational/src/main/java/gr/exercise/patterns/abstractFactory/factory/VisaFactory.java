package gr.exercise.patterns.abstractFactory.factory;

import gr.exercise.patterns.abstractFactory.card.CreditCard;
import gr.exercise.patterns.abstractFactory.card.VisaBlackCreditCard;
import gr.exercise.patterns.abstractFactory.validator.Validator;
import gr.exercise.patterns.abstractFactory.validator.VisaValidator;
import gr.exercise.patterns.abstractFactory.card.VisaGoldCreditCard;

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
