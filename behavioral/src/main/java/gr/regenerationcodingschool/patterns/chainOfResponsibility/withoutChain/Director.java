package gr.regenerationcodingschool.patterns.chainOfResponsibility.withoutChain;

public class Director {
	public void handleRequest(Request request) {
		System.out.println("Directors can approve conferences");
	}
}
