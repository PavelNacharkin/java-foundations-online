package ru.itsjava.interfaces.clonable;

public class ClonablePratice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Girl dasha = new Girl("Dasha", 168);
        Girl dasha2 = (Girl) dasha.clone();
        System.out.println("dasha2 = " + dasha2);
        System.out.println("dasha = " + dasha);
    }
}
