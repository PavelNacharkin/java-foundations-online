package ru.itsjava.jdbc.hw.dao;

import java.sql.*;

public class UserJdbcImpl implements UserDao {
    public static final String DB_URL = "";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";

    @Override
//    public int getAgeByUserName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT age FROM my_home_work.users" +
//                    " where name = '" + name +"'" );
//            resultSet.next();
//            return resultSet.getInt("age");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return 0;
//    }

    public int getAgeByUserName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT age FROM my_home_work.users where name = ? ")) {

            preparedStatement.setString(1, "Pavel");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
