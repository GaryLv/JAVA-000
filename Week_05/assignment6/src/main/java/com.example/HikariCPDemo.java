package com.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HikariCPDemo {
    public static void main(String[] args) throws SQLException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/test0");
        config.setUsername("root");
        config.setPassword("root@123");
        HikariDataSource dataSource = new HikariDataSource(config);
        String sql = "INSERT INTO students_tbl(id, name) VALUES (?, ?)";
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 100);
            statement.setString(2, "tony");
            statement.execute();
            statement.setInt(1, 200);
            statement.setString(2, "jackson");
            statement.execute();

            sql = "SELECT * FROM students_tbl";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(id + ", " + name);
            }
            // 100, tony
            // 200, jackson
            resultSet.close();
            statement.close();
        }
    }
}
