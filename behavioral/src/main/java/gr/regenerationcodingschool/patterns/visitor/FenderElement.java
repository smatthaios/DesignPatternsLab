package gr.regenerationcodingschool.patterns.visitor;

public class FenderElement implements AtvPartElement {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
