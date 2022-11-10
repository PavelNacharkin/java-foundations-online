package ru.itsjava.interfaceHW.abstractAndInterface;

public class Main {
    public static void main(String[] args) {
        Man petr = new Man();
        petr.eat();
        petr.talk();

        Plant cactus = new Plant();
        cactus.eat();

        Cow burenka  = new Cow();
        burenka.eat();
        burenka.talk();



    }
}
