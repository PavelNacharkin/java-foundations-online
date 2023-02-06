package ru.itsjava.jdbc.hw;

import ru.itsjava.jdbc.hw.dao.UserJdbcImpl;

public class JdbcHW {

    public static void main(String[] args) {
        UserJdbcImpl dao = new UserJdbcImpl();
        System.out.println("dao.getAgeByUserName(\"PAVEL\") = " + dao.getAgeByUserName("PAVEL"));
    }
}
