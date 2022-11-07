package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Boy  implements Comparable<Boy>{
    private final String name;
    private double age;
    private double high;


    @Override
    public int compareTo(Boy o) {
        return 0;
    }
}
