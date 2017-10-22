package gr.regenerationcodingschool.patterns.strategy;

public class AmexStrategy extends ValidationStrategy {

    private static final int VALID_AMEX_CARD_DIGIT_LENGTH = 15;
    private static final String VALID_AMEX_CARD_PREFIX = "34";
    private static final String VALID_AMEX_CARD_PREFIX_2 = "37";

    @Override
    public boolean isValid(CreditCard creditCard) {
        return hasCorrectPrefix(creditCard.getNumber()) && hasCorrectLength(creditCard.getNumber()) && passesLuhn(creditCard.getNumber());
    }

    private boolean hasCorrectPrefix(String creditCardNumber) {
        return creditCardNumber.startsWith(VALID_AMEX_CARD_PREFIX) || creditCardNumber.startsWith(VALID_AMEX_CARD_PREFIX_2);
    }

    private boolean hasCorrectLength(String creditCardNumber) {
        return creditCardNumber.length() == VALID_AMEX_CARD_DIGIT_LENGTH;
    }

}
