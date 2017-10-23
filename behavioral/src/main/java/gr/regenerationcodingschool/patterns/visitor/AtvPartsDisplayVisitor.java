package gr.regenerationcodingschool.patterns.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

	@Override
	public void visit(WheelElement wheelElement) {
		System.out.println("We have a wheelElement.");
	}

	@Override
	public void visit(FenderElement fenderElement) {
		System.out.println("We have a fenderElement.");

	}

	@Override
	public void visit(OilElement oilElement) {
		System.out.println("We have oilElement.");

	}

	@Override
	public void visit(PartsOrderElement partsOrderElement) {
		System.out.println("We have an order.");

	}

}
