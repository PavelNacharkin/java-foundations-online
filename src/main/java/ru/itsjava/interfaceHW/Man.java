package ru.itsjava.interfaceHW;

public class Man implements Walkable, Swimable, Runnable {
    @Override
    public void run() {
        System.out.println("Играть в салочки");

    }

    @Override
    public int maxRunDistance() {
        return 20;
    }

    @Override
    public void swim() {
        System.out.println("плавать в бассеине ");

    }

    @Override
    public double maxSwimSpeed() {
        return 8;
    }

    @Override
    public void walk() {
        System.out.println("Выгуливать собаку утром и вечером");

    }
}
