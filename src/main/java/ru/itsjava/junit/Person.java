package ru.itsjava.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public boolean takeBeer() {
        if (age >= 18)
            return true;
        return false;
    }

    public void birthday() {
        int nextAge = age + 1;
        age = nextAge;
    }
}
