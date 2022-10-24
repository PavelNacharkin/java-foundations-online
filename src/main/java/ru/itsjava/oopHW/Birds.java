package ru.itsjava.oopHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Birds {
    private boolean isHomey;
    private boolean isTalking;
    private final String colour;
    private final String nutrition;
}