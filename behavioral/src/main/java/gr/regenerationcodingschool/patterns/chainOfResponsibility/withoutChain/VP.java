package gr.regenerationcodingschool.patterns.chainOfResponsibility.withoutChain;

public class VP {

	public void handleRequest(Request request) {
		System.out.println("VPs can approve purchases below 1500");
	}
}
