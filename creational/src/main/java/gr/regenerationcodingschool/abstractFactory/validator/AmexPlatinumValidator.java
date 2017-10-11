package gr.regenerationcodingschool.abstractFactory.validator;

import gr.regenerationcodingschool.abstractFactory.card.CreditCard;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
