package ru.itsjava.interfaceHW;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Буль-буль");

    }

    @Override
    public double maxSwimSpeed() {
        return 70.0;
    }
}
