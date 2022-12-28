package ru.itsjava.collections.maps.mapHW;

import ru.itsjava.collections.maps.Man;

import java.util.HashMap;
import java.util.Map;

public class MapHW {

    public static void main(String[] args) {
        Map<String, Fruit> oldFruit = new HashMap<>();
        Fruit apple = new Fruit("Яблоко", 500);
        Fruit pear = new Fruit("Груша", 450);
        Fruit banana = new Fruit("Банан", 300);
        Fruit pineapple = new Fruit("Ананас", 960);
        Fruit pomegranate = new Fruit("Гранат", 700);

        oldFruit.put("Pavel", apple);
        oldFruit.put("Irina", pear);
        oldFruit.put("Mihail", banana);
        oldFruit.put("Danya", pineapple);
        oldFruit.put("Kristina", pomegranate);

        Map<String, Fruit> newFruit = new HashMap<>();
        newFruit.putAll(oldFruit);

        System.out.println("newFruit.get(\"Pavel\") = " + newFruit.get("Pavel"));

        System.out.println("newFruit.remove(\"Mihail\") = " + newFruit.remove("Mihail"));

        System.out.println("newFruit.containsKey(\"Kristina\") = " + newFruit.containsKey("Kristina"));
        System.out.println("newFruit.containsValue(pineapple) = " + newFruit.containsValue(pineapple));

        System.out.println();

        for (String keyFruit : newFruit.keySet()) {
            System.out.println(keyFruit);
        }

        System.out.println();

        for (String keyFruit : newFruit.keySet()) {
            System.out.println(newFruit.get(keyFruit));
        }

        System.out.println();

        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
