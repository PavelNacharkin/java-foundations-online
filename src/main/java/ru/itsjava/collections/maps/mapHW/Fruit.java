package ru.itsjava.collections.maps.mapHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruit {
    private final String name;
    private final int weight;

    public String toString() {
        return "Fruit(name=" + this.getName() + ", weight=" + this.getWeight() + " грамм " + ")";
    }
}
