package gr.regenerationcodingschool.patterns.chainOfResponsibility.withoutChain;

public class CEO {

	public void handleRequest(Request request) {
		System.out.println("CEOs can approve anything they want");
	}
}
