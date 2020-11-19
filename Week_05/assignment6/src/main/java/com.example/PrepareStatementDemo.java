package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test0", "root", "root@123");
        String sql = "INSERT INTO students_tbl(id, name) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, 10);
        statement.setString(2, "allen");
        statement.execute();
        statement.setInt(1, 11);
        statement.setString(2, "dolphin");
        statement.execute();
        sql = "SELECT * FROM students_tbl";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + ", " + name);
        }
        // 10, allen
        // 11, dolphin
        resultSet.close();
        statement.close();
        connection.close();
    }
}
