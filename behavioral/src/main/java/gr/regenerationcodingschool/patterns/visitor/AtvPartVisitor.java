package gr.regenerationcodingschool.patterns.visitor;

public interface AtvPartVisitor {
	void visit(WheelElement wheelElement);
	void visit(FenderElement fenderElement);
	void visit(OilElement oilElement);
	void visit(PartsOrderElement partsOrderElement);
}
