package gr.regenerationcodingschool.patterns.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrderElement implements AtvPartElement {
	
	private List<AtvPartElement> parts = new ArrayList<>();
	
	public PartsOrderElement() {
		
	}
	
	public void addPart(AtvPartElement atvPartElement) {
		parts.add(atvPartElement);
	}
	
	public List<AtvPartElement> getParts() {
		return Collections.unmodifiableList(parts);
	}
	
	@Override
	public void accept(AtvPartVisitor visitor) {
		for (AtvPartElement atvPartElement : parts) {
			atvPartElement.accept(visitor);
		}
		visitor.visit(this);
	}
}
