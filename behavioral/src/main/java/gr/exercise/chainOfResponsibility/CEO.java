package gr.exercise.chainOfResponsibility;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEOs can approve anything they want");
	}
}
