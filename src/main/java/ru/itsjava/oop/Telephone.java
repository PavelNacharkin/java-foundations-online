package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Telephone {
    private final String brand;
    private boolean isHomey;

}