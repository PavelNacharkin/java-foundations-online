package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;


@MyAnnotation(message = "я персона номер 1", flag = true)
@AllArgsConstructor
@ToString
public class Person {
    private final String name;
    private boolean isGood;


}
