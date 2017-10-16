package gr.regenerationcodingschool.patterns.bridge.printerWithBridge;

import java.util.List;

public abstract class Printer {

	//this is the Composition
	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	abstract protected List<Detail> getDetails();
	
	abstract protected String getHeader();
}
