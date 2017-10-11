package gr.regenerationcodingschool.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String arg[]) {

        DbSingleton instance = DbSingleton.getInstance();
        Connection conn = getConnection(instance);


        Statement sta;
        try {
            sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created.");
            sta.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        conn = getConnection(instance);

    }

    private static Connection getConnection(DbSingleton instance) {
        long timeBefore;
        long timeAfter;
        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);
        return conn;
    }

}
