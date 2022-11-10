package ru.itsjava.interfaceHW.abstractAndInterface;

public interface Eatable {
    default void eat(){
        System.out.println("Eat");
    }
}
