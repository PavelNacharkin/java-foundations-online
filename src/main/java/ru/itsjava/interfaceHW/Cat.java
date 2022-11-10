package ru.itsjava.interfaceHW;

public class Cat implements Walkable, Runnable {
    @Override
    public void run() {
        System.out.println("Тыгы-дык по дому ночью");

    }

    @Override
    public int maxRunDistance() {
        return 1000;
    }

    @Override
    public void walk() {
        System.out.println("Мурк, гулять");

    }

    public static class Man {
    }
}
