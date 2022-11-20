package ru.itsjava.exceptions.exceptonsHW;

public class Person {
    private final String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        try {
            if ((age <= 0) || (age >= 150)) {
                throw new AgeNotValidException("Возраст некорректен");
            }

        } catch (AgeNotValidException e) {
            e.printStackTrace();
        }
        this.age = age;


    }
}