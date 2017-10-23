package gr.regenerationcodingschool.patterns.visitor;

public class OilElement implements AtvPartElement {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
