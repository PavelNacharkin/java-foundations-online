package ru.itsjava.jdbc.lesson;

import ru.itsjava.jdbc.lesson.dao.EmployerJdbcImpl;

public class JdbcPractice {
//    public static final String DB_URL = "";
//    public static final String DB_LOGIN = "";
//    public static final String DB_PASSWORD = "";


    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT name, age FROM schema_online_course.employers;");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name") + ":" + resultSet.getInt("age"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        EmployerJdbcImpl dao = new EmployerJdbcImpl();
        System.out.println(dao.findAgeByName("tanya"));

    }
}
