package ru.itsjava.interfaceHW.abstractAndInterface;

public interface Talkable {
    default void talk(){
        System.out.println("Talk");
    }
}
