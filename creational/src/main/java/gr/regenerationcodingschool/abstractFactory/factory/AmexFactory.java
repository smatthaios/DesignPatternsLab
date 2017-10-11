package gr.regenerationcodingschool.abstractFactory.factory;

import gr.regenerationcodingschool.abstractFactory.card.AmexGoldCreditCard;
import gr.regenerationcodingschool.abstractFactory.card.AmexPlatinumCreditCard;
import gr.regenerationcodingschool.abstractFactory.card.CreditCard;
import gr.regenerationcodingschool.abstractFactory.validator.AmexGoldValidator;
import gr.regenerationcodingschool.abstractFactory.validator.AmexPlatinumValidator;
import gr.regenerationcodingschool.abstractFactory.validator.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();

            case PLATINUM:
                return new AmexPlatinumCreditCard();

            default:
                break;
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD:

                return new AmexGoldValidator();

            case PLATINUM:

                return new AmexPlatinumValidator();

        }

        return null;
    }
}
