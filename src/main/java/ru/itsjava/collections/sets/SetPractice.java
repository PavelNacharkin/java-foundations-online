package ru.itsjava.collections.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Man andey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man vitya = new Man("Vitya");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andey, maxim, vitya));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.add(andey) = " + manSet.add(andey));
        System.out.println("manSet = " + manSet);

        Man andrey2 = new Man("Andrey");

        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));
        System.out.println("manSet.contains(andey) = " + manSet.contains(andey));

        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));

        System.out.println("manSet = " + manSet);

        System.out.println("manSet.size() = " + manSet.size());

    }

}
