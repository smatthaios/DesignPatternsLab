package gr.exercise.patterns.abstractFactory.validator;

import gr.exercise.patterns.abstractFactory.card.CreditCard;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
