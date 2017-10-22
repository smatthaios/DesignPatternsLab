package gr.regenerationcodingschool.patterns.chainOfResponsibility.withoutChain;

import gr.regenerationcodingschool.patterns.chainOfResponsibility.Handler;
import gr.regenerationcodingschool.patterns.chainOfResponsibility.Request;
import gr.regenerationcodingschool.patterns.chainOfResponsibility.RequestType;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Directors can approve conferences");
		}
		else {
			successor.handleRequest(request);
		}
	}
}
