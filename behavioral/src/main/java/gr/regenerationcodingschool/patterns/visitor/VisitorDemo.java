package gr.regenerationcodingschool.patterns.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        WheelElement wheelElement = new WheelElement();
        wheelElement.accept(new AtvPartsShippingVisitor());
        wheelElement.accept(new AtvPartsDisplayVisitor());

        FenderElement fenderElement = new FenderElement();
        fenderElement.accept(new AtvPartsShippingVisitor());
        fenderElement.accept(new AtvPartsDisplayVisitor());

        OilElement oilElement = new OilElement();
        oilElement.accept(new AtvPartsShippingVisitor());
        oilElement.accept(new AtvPartsDisplayVisitor());

		/*PartsOrderElement order = new PartsOrderElement();
        order.addPart(new WheelElement());
		order.addPart(new FenderElement());
		order.addPart(new OilElement());

		order.accept(new AtvPartsShippingVisitor());
		order.accept(new AtvPartsDisplayVisitor());*/


    }
}
