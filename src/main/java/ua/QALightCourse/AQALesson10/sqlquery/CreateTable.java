package ua.QALightCourse.AQALesson10.sqlquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        final String dbURL = "jdbc:mysql://109.197.216.13:3306/ATAM_db";
        final String userName = "root";
        final String password = "6Ztz3rsrVNeWfbCH";

        String sqlQueryToCreateDataBase = "CREATE TABLE IF NOT EXISTS newTable (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "login VARCHAR(255) NOT NULL, " +
                "password VARCHAR(255) NOT NULL" +
                ");";

        try(Connection connectionToMySQLBase = DriverManager.getConnection(dbURL,userName,password)){
            Statement statement = connectionToMySQLBase.createStatement();
            statement.executeUpdate(sqlQueryToCreateDataBase);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
