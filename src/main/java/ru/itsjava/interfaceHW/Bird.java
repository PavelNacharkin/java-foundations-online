package ru.itsjava.interfaceHW;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Гуля_гуля");

    }

    @Override
    public String flyMaxDistance() {
        return null;
    }
}
