package ru.itsjava.jdbc.lesson.dao;

import java.sql.*;

public class EmployerJdbcImpl implements EmployerDao {
    public static final String DB_URL = "";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";

//    @Override
//    public int findAgeByName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT age FROM schema_online_course.employers" +
//                    " where name = '" + name + "'");
//            resultSet.next();
//            return resultSet.getInt("age");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return 0;
//    }


    @Override
    public int findAgeByName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM schema_online_course.employers where name = ?")
        ) {
            preparedStatement.setString(1, "tanya");

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
