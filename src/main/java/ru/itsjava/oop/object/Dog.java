package ru.itsjava.oop.object;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Dog {
    private final String nickname;
    private int pawsCount;

}
