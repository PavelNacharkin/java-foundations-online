package ru.itsjava.annotations.hW;

import lombok.AllArgsConstructor;
import lombok.ToString;

@MyAnnotationHW(department = "Mathematics department")
@AllArgsConstructor
@ToString
public class MathStudent {
    private final String name;
    private final String surname;
    private int course;
}
