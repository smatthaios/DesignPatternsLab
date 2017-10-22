package gr.regenerationcodingschool.exercises.adaptedEmployees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AdapterClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdapterClient.class);

    public static void main(String[] args) {
        EmployeeGenerator generator = new EmployeeGenerator();

        List<Employee> employees = generator.generateEmployeeList();
        employees.forEach(e -> LOGGER.info(e.toString()));
    }
}
