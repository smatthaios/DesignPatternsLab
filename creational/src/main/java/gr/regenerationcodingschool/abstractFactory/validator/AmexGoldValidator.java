package gr.regenerationcodingschool.abstractFactory.validator;

import gr.regenerationcodingschool.abstractFactory.card.CreditCard;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
