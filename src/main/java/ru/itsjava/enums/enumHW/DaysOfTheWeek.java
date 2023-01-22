package ru.itsjava.enums.enumHW;

public enum DaysOfTheWeek {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"),
    THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private final String translate;

    DaysOfTheWeek(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    @Override
    public String toString() {
        return "DaysOfTheWeek (" + this.name() + " → " +
                translate + ")";
    }
}
