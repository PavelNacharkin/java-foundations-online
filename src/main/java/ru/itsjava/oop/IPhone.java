package ru.itsjava.oop;

public class IPhone extends Telephone {
    public IPhone() {
        super("Apple", false);
    }
    public String toString(){
return "переопределенный метод toString";
    }
}
