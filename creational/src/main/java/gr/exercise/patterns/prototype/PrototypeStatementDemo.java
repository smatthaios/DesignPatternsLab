package gr.exercise.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeStatementDemo {

    public static void main(String args[]) {

        String sql = "select * from users where name = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Stelios");

        Record record = new Record();

        //Check Statement class
        Statement firstStatement = new Statement(sql, parameters, record);

        //printStatement(firstStatement);

        Statement secondStatement = firstStatement.clone();
        parameters.add("George");

        printStatement(firstStatement);
        printStatement(secondStatement);

    }

    private static void printStatement(Statement statement) {
        System.out.println(statement);
        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());
        System.out.println("\n");
    }
}