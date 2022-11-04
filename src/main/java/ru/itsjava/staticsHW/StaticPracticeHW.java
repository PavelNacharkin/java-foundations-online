package ru.itsjava.staticsHW;

public class StaticPracticeHW {
    public static void main(String[] args) {
        Car bentley = new Car("Bentley", "black");
        Car zhiguli = new Car("Zhiguli", "white");
        System.out.println("bentley.getPrise() = " + bentley.getPrise());
        System.out.println("zhiguli.getPrise() = " + zhiguli.getPrise());
        Car.setPrice(50_000.0);
        System.out.println("bentley.getPrise() / zhiguli.getPrise() = " + bentley.getPrise() + " / " + zhiguli.getPrise());
    }
}
