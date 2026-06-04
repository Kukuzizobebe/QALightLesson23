package ua.QALightCourse.AQALesson10.homework.db.sqlquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {
    public static void main(String[] args) {
        final String URL = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        final String userName = "root";
        final String dbPassword = "6Ztz3rsrVNeWfbCH";

        String userEmail = "email@example.com";
        String userPassword = "Password1";

        String sqlQueryToAddUser = "INSERT INTO Rud_usersDataTable (login,password) VALUES (?,?)";

        try(Connection connectiontoMySQLDB = DriverManager.getConnection(URL,userName,dbPassword);
            PreparedStatement preparedStatement = connectiontoMySQLDB.prepareStatement(sqlQueryToAddUser)){
            preparedStatement.setString(1, userEmail);
            preparedStatement.setString(2, userPassword);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
