package gr.regenerationcodingschool.abstractFactory;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class AbstractFactoryDocumentBuilderFactoryDemo {

	public static void main (String args[]) throws Exception {
		
		String xml = "<document><body><stock>AAPL</stock></body></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

		//Abstract Factory
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();

		//Concrete Factory
		DocumentBuilder factory = abstractFactory.newDocumentBuilder();

        //Concrete Class returned
		Document doc = factory.parse(bais);

		doc.getDocumentElement().normalize();
		
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		
		System.out.println(abstractFactory.getClass());
		System.out.println(factory.getClass());
		
				
	}
}
