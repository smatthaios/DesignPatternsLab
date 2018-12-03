package gr.exercise.patterns.singleton;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbWrongSingleton {

    private static DbWrongSingleton instance = null;

    private DbWrongSingleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbWrongSingleton getInstance() {
        //not a singleton - new instance each time
        if (instance == null) {
            instance = new DbWrongSingleton();
        }
        return instance;
    }

}
