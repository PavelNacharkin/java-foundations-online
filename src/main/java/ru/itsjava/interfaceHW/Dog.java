package ru.itsjava.interfaceHW;

public class Dog implements Walkable, Runnable, Swimable {
    @Override
    public void run() {
        System.out.println("Бегать!");

    }

    @Override
    public int maxRunDistance() {
        return 1000;
    }

    @Override
    public void swim() {
        System.out.println("Купаца :) ");

    }

    @Override
    public double maxSwimSpeed() {
        return 10;
    }

    @Override
    public void walk() {
        System.out.println("гулять утром и вечером");

    }
}
