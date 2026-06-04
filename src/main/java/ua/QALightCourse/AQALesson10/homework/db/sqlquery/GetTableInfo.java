package ua.QALightCourse.AQALesson10.homework.db.sqlquery;

import java.sql.*;

public class GetTableInfo {

    public static void main(String[] args) {
        final String URL = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        final String userName = "root";
        final String dbPassword = "6Ztz3rsrVNeWfbCH";

        String tableName = "Rud_usersDataTable";
        String query = "SELECT * FROM " + tableName;

        try (Connection connection = DriverManager.getConnection(URL, userName, dbPassword);
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%-20s", metaData.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= columnCount; i++) {
                System.out.print("--------------------");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%-20s", rs.getString(i));
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
