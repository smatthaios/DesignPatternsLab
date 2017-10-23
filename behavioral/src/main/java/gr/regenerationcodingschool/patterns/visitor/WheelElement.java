package gr.regenerationcodingschool.patterns.visitor;

public class WheelElement implements AtvPartElement {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
