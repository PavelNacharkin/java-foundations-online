package ru.itsjava.staticsHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private String brand;
    private String colour;
    public static double price = 30_000.0;


    public double getPrise() {
        return price;
    }

    public static void setPrice(double price1) {
        price = price1;
    }

}
