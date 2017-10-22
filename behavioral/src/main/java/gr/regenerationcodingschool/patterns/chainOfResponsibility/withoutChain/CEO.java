package gr.regenerationcodingschool.patterns.chainOfResponsibility.withoutChain;

import gr.regenerationcodingschool.patterns.chainOfResponsibility.Handler;
import gr.regenerationcodingschool.patterns.chainOfResponsibility.Request;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEOs can approve anything they want");
	}
}
