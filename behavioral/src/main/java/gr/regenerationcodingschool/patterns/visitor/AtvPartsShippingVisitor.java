package gr.regenerationcodingschool.patterns.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

	 double shippingAmount = 0;
		
		@Override
		public void visit(WheelElement wheelElement) {
			System.out.println("Wheels are bulky and expensive to ship.");
			shippingAmount += 15;
		}

		@Override
		public void visit(FenderElement fenderElement) {
			System.out.println("Fenders are light and cheap to ship.");
			shippingAmount += 3;
		}

		@Override
		public void visit(OilElement oilElement) {
			System.out.println("OilElement is hazardous and has a fee to ship.");
			shippingAmount += 9;
		}

		@Override
		public void visit(PartsOrderElement order) {
			System.out.println("If they bought more than 3 things we will give them a discount on shipping.");
			List<AtvPartElement> parts = order.getParts();
			if(parts.size() > 3) {
				shippingAmount -= 5;
			}
			System.out.println("Shipping amount is: " + shippingAmount);
		}
}
