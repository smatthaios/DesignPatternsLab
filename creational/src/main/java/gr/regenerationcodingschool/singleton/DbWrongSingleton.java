package gr.regenerationcodingschool.singleton;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbWrongSingleton {

    //private static DbSingleton instance = new DbSingleton();

	private DbWrongSingleton() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DbWrongSingleton getInstance() {
		//not a singleton - new instance each time
		return new DbWrongSingleton();
	}
	
}
