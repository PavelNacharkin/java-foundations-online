package ru.itsjava.interfaceHW.standartInterfaceHW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person petr = new Person("Petr", "Konovalov", 23);
        Person petr1 = new Person("Petr ", "Konovalov", 23);
        Person danya = new Person("Danya", "Pechenegov", 29);
        Person svetlana = new Person("Svetlana", "Antonova", 78);
        Person kristina = new Person("Kristina", "lapova", 36);

        System.out.println("petr.compareTo(danya) = " + petr.compareTo(danya));
        System.out.println("petr1.compareTo(petr) = " + petr1.compareTo(petr));
        System.out.println("petr.compareTo(petr1) = " + petr.compareTo(petr1));
        Person[] persons = {petr1, petr1, danya, svetlana, kristina};
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person danya2= (Person) danya.clone();
    }
}
