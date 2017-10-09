package gr.regenerationcodingschool.abstractFactory.validator;

import gr.regenerationcodingschool.abstractFactory.card.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
