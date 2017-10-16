package gr.regenerationcodingschool.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdapterClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdapterClient.class);

    public static void main(String[] args) {
        SocketAdapter sockAdapter = new SocketAdapterImpl();
        Volt v3 = sockAdapter.get3Volt();
        LOGGER.info("v3 volts using Adapter = " + v3.getVolts());

        Volt v12 = sockAdapter.get12Volt();
        LOGGER.info("v12 volts using Adapter = " + v12.getVolts());

        Volt v120 = sockAdapter.get120Volt();
        LOGGER.info("v120 volts using Adapter = " + v120.getVolts());
    }
}
