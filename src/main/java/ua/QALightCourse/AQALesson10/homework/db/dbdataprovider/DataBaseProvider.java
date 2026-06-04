package ua.QALightCourse.AQALesson10.homework.db.dbdataprovider;

import org.apache.commons.lang3.tuple.Pair;

import java.sql.*;

public class DataBaseProvider {

    public static Pair<String, String> getUserCredentials() {
        final String URL = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        final String userName = "root";
        final String dbPassword = "6Ztz3rsrVNeWfbCH";

        Pair<String, String> usersData = null;

        String sql = "SELECT login, password FROM newTable";

        try (Connection connection = DriverManager.getConnection(URL, userName, dbPassword);
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(sql)) {

            while (result.next()) {
                String login = result.getString("login");
                String password = result.getString("password");
                usersData = (Pair.of(login, password));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error while fetching users from DB", e);
        }

        return usersData;
    }
}
