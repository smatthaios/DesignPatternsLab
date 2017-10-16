package gr.regenerationcodingschool.bridge.shapeWithoutBridge;

public class Shape1BridgeDemo {

	public static void main(String args[]) {

		Circle circle = new BlueCircle();

		Square square = new RedSquare();

		// What if I want a green square?
		//Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		//greenSquare.applyColor();
	}

}
