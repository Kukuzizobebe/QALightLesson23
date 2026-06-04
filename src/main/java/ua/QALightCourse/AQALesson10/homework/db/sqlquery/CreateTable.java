package ua.QALightCourse.AQALesson10.homework.db.sqlquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        final String URL = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        final String userName = "root";
        final String dbPassword = "6Ztz3rsrVNeWfbCH";

        String sqlQueryToCreateTable = "CREATE TABLE IF NOT EXISTS Rud_usersDataTable (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "login VARCHAR(255) NOT NULL, " +
                "password VARCHAR(255) NOT NULL" +
                ");";
        try (Connection connectionToMySQLDB = DriverManager.getConnection(URL, userName, dbPassword);
             Statement statement = connectionToMySQLDB.createStatement()) {
            statement.executeUpdate(sqlQueryToCreateTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
