package ru.itsjava.interfaceHW.standartInterfaceHW;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Person implements Cloneable,Comparable<Person> {
    private final String name;
    private final String surname;
    private int age;

    @Override
    public int compareTo(Person person) {
        int conclusion = surname.compareTo(person.surname);
        if (conclusion == 0) {
            conclusion = name.compareTo(person.name);
            if (conclusion == 0) {
                conclusion = age - person.age;
            }
        }
        return conclusion;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}