package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectorDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test0", "root", "root@123");
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO students_tbl(id, name) VALUES (1, \"JACK\")";
        statement.execute(sql);
        sql = "INSERT INTO students_tbl(id, name) VALUES (2, \"JOHN\")";
        statement.execute(sql);
        sql = "SELECT * FROM students_tbl";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + ", " + name);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
