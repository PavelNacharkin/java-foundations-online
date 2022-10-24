package ru.itsjava.oopHW;


public class Parrot extends Birds {

    public Parrot() {
        super(true, true, "Белый", "Растительноядный");
    }

    public Parrot(boolean isHomey, boolean talking, String colour, String nutrition) {
        super(isHomey, talking, colour, nutrition);
    }

}
