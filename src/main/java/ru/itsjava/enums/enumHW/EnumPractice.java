package ru.itsjava.enums.enumHW;

import java.util.Scanner;

public class EnumPractice {
    public static void main(String[] args) {

        DaysOfTheWeek[] days = DaysOfTheWeek.values();
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i].getTranslate() + " ");

        }
        System.out.println();
        for (DaysOfTheWeek daysOfTheWeek : days) {
            System.out.print(daysOfTheWeek.name() + " ");

        }
    }
}
