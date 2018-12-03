package gr.exercise.patterns.abstractFactory.validator;

import gr.exercise.patterns.abstractFactory.card.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
