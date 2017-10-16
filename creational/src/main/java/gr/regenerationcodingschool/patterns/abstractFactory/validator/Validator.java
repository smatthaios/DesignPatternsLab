package gr.regenerationcodingschool.patterns.abstractFactory.validator;

import gr.regenerationcodingschool.patterns.abstractFactory.card.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
