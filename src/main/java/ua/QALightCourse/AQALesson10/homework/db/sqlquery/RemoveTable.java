package ua.QALightCourse.AQALesson10.homework.db.sqlquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoveTable {

    public static void main(String[] args) {
        final String URL = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        final String userName = "root";
        final String dbPassword = "6Ztz3rsrVNeWfbCH";

        String sqlQueryToRemoveTable = "DROP TABLE IF EXISTS Rud_usersDataTable;";

        try (Connection connectionToMySQLBase = DriverManager.getConnection(URL, userName, dbPassword);
             Statement statement = connectionToMySQLBase.createStatement()) {
            statement.executeUpdate(sqlQueryToRemoveTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
