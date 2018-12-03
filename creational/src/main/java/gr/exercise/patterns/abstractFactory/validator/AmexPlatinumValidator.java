package gr.exercise.patterns.abstractFactory.validator;

import gr.exercise.patterns.abstractFactory.card.CreditCard;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
