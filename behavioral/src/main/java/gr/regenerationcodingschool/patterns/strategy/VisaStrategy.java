package gr.regenerationcodingschool.patterns.strategy;

public class VisaStrategy extends ValidationStrategy {

    private static final int VALID_VISA_CARD_DIGIT_LENGTH = 16;
    private static final String VALID_VISA_CARD_PREFIX = "4";

    @Override
    public boolean isValid(CreditCard creditCard) {
        return hasCorrectPrefix(creditCard.getNumber()) && hasCorrectLength(creditCard.getNumber()) && passesLuhn(creditCard.getNumber());
    }

    private boolean hasCorrectPrefix(String creditCardNumber) {
        return creditCardNumber.startsWith(VALID_VISA_CARD_PREFIX);
    }

    private boolean hasCorrectLength(String creditCardNumber) {
        return creditCardNumber.length() == VALID_VISA_CARD_DIGIT_LENGTH;
    }

}
