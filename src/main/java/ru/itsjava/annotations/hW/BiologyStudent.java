package ru.itsjava.annotations.hW;

import lombok.AllArgsConstructor;
import lombok.ToString;

@MyAnnotationHW(department = "Biology department")
@AllArgsConstructor
@ToString
public class BiologyStudent {
    private final String name;
    private final String surname;
    private int course;
}
