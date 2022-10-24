package ru.itsjava.oopHW;

public class OOPHomeWork {
    public static void main(String[] args) {

        Birds kesha = new Parrot();
        Birds inakentiy = new Parrot(true, false, "Желто-зеленый", "Растительноядный");
        System.out.println("kesha.getColour() = " + kesha.getColour());
        System.out.println("kesha.getTalking() = " + kesha.isTalking());
        kesha.setTalking(false);
        System.out.println("kesha.getTalking() = " + kesha.isTalking());
        System.out.println("kesha.toString() = " + kesha.toString());
        System.out.println("inakentiy.toString() = " + inakentiy.toString());

        Birds erick = new Crow();
        Birds markus = new Crow(false, false, "Темный", "Всеядный");
        System.out.println("markus = " + markus);
        System.out.println("erick = " + erick);
        System.out.println("erick.getTalking() = " + erick.isTalking());
        markus.setTalking(true);
        erick.setTalking(true);
        System.out.println("markus.getIsHomey() = " + markus.isHomey());
        System.out.println("erick.getTalking() = " + erick.isTalking());

        Chair dXRacer = new ComputerChair();
        dXRacer.song();
        System.out.println("kesha.getClass() = " + kesha.getClass());

        System.out.println("kesha.equals(markus) = " + kesha.equals(markus));
    }
}
