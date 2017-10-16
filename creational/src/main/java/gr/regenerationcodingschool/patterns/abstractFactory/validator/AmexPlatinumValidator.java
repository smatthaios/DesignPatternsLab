package gr.regenerationcodingschool.patterns.abstractFactory.validator;

import gr.regenerationcodingschool.patterns.abstractFactory.card.CreditCard;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
