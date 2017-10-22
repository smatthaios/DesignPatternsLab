package gr.regenerationcodingschool.patterns.strategy;

public class CreditCard {

	private String number;
	private String date;
	private String cvv;
	private ValidationStrategy cardValidator;
	
	public CreditCard(ValidationStrategy cardValidator) {
		this.cardValidator = cardValidator;
	}
	
	public boolean isValid() {
		return cardValidator.isValid(this);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
}
