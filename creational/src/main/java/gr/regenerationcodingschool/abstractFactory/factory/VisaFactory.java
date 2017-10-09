package gr.regenerationcodingschool.abstractFactory.factory;

import gr.regenerationcodingschool.abstractFactory.card.CreditCard;
import gr.regenerationcodingschool.abstractFactory.card.VisaBlackCreditCard;
import gr.regenerationcodingschool.abstractFactory.card.VisaGoldCreditCard;
import gr.regenerationcodingschool.abstractFactory.validator.Validator;
import gr.regenerationcodingschool.abstractFactory.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
