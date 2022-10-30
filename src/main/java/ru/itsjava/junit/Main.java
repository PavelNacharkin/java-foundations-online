package ru.itsjava.junit;

public class Main {
    public static void main(String[] args) {
        Person pavel = new Person("Pavel",17);
        pavel.birthday();
        System.out.println("pavel.takeBeer() = " + pavel.takeBeer());
        pavel.birthday();
    }
}
