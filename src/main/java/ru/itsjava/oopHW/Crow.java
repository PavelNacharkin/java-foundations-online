package ru.itsjava.oopHW;

public class Crow extends Birds {
    public Crow() {
        super(false, false, "Черный", "Всеядный");
    }

    public Crow(boolean isHomey, boolean talking, String colour, String nutrition) {
        super(isHomey, talking, colour, nutrition);
    }

}
