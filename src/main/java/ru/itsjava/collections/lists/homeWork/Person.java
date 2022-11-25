package ru.itsjava.collections.lists.homeWork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Person {
    private final String name;
    private int age;
    private final String gender;
}
