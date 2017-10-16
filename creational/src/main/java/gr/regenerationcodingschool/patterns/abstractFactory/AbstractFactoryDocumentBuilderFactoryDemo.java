package gr.regenerationcodingschool.patterns.abstractFactory;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class AbstractFactoryDocumentBuilderFactoryDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFactoryDocumentBuilderFactoryDemo.class);

    public static void main(String args[]) throws Exception {

        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        //Abstract Factory
        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();

        //Concrete Factory
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();

        //Concrete Class returned
        Document doc = factory.parse(bais);

        doc.getDocumentElement().normalize();

        LOGGER.info("Root element :" + doc.getDocumentElement().getNodeName());

        LOGGER.info(abstractFactory.getClass().toString());
        LOGGER.info(factory.getClass().toString());
    }
}
