package gr.regenerationcodingschool.exercises.adaptedEmployees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AdapterClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdapterClient.class);

    public static void main(String[] args) {
        EmployeeDB employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        LOGGER.info(employeeFromDB.toString());

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        LOGGER.info(employeeFromLdap.toString());

        EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
        LOGGER.info(employeeFromCSV.toString());
    }
}
