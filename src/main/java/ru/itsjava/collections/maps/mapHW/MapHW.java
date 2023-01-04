package ru.itsjava.collections.maps.mapHW;

import ru.itsjava.collections.maps.Man;

import java.util.HashMap;
import java.util.Map;

public class MapHW {

    public static void main(String[] args) {
        /* 0. Создать экземпляр HashMap (Ключ Имя покупателя Значение Фрукт) */
        Map<String, Fruit> oldFruit = new HashMap<>();
        Fruit apple = new Fruit("Яблоко", 500);
        Fruit pear = new Fruit("Груша", 450);
        Fruit banana = new Fruit("Банан", 300);
        Fruit pineapple = new Fruit("Ананас", 960);
        Fruit pomegranate = new Fruit("Гранат", 700);

        /*Добавить 5 фруктов*/
        oldFruit.put("Pavel", apple);
        oldFruit.put("Irina", pear);
        oldFruit.put("Mihail", banana);
        oldFruit.put("Danya", pineapple);
        oldFruit.put("Kristina", pomegranate);

        /* В новый экземпляр HashMap добавим старую карту*/
        Map<String, Fruit> newFruit = new HashMap<>();
        newFruit.putAll(oldFruit);

        /*Получить любой фрукт по покупателю*/
        System.out.println("newFruit.get(\"Pavel\") = " + newFruit.get("Pavel"));

        /*Удалить любой фрукт*/
        System.out.println("newFruit.remove(\"Mihail\",banana) = " + newFruit.remove("Mihail", banana));

        /*Проверка на наличие ключ и значение*/
        System.out.println("newFruit.containsKey(\"Kristina\") = " + newFruit.containsKey("Kristina"));
        System.out.println("newFruit.containsValue(pineapple) = " + newFruit.containsValue(pineapple));

        System.out.println();

        /*Вывести все ключи*/
        for (String keyFruit : newFruit.keySet()) {
            System.out.println(keyFruit);
        }

        System.out.println();

        /*Вывести все значения*/
        for (String keyFruit : newFruit.keySet()) {
            System.out.println(newFruit.get(keyFruit));
        }

        System.out.println();

        /*Вывести все ключи и значения с помощью entrySet*/
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println();

        /* вернуть количество ключей длина которых больше 5*/
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            if (pair.getKey().length() > 5) {
                System.out.println(pair.getKey());
            }
        }

        System.out.println();

        /*Вернуть количество элементов, которые равны "***" (фруктов, которые равны дыне)*/

        Fruit melon = new Fruit("Дыня", 900);
        newFruit.put("Dima", melon);
        newFruit.put("Ivan", melon);
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            if (pair.getValue().getName().equals("Дыня")) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }

        System.out.println();

        /*Пропустить 2 элемента, значения которых Арбуз, все остальные вывести*/
        Fruit watermelon = new Fruit("Арбуз", 840);
        newFruit.put("Vlad", watermelon);
        newFruit.put("Konstantin", watermelon);
        newFruit.put("Oleg", watermelon);
        int count = 0;
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            if (pair.getValue().getName().contains("Арбуз") && count < 2) {
                count++;
            } else {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }

        System.out.println();

        /* Вывести все кроме 2 элементов, ключи которых начинаются на А*/
        newFruit.put("Andrey", pineapple);
        newFruit.put("Alex", banana);
        newFruit.put("Artem", apple);
        int count1 = 0;
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            if (pair.getKey().charAt(0) == 'A' && count1 < 2) {
                count1++;
            } else {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }

        System.out.println();

        /*Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.*/
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("АРБУз")) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
                break;
            }
        }
        System.out.println();

        /*Возвращаем все элементы в другую карту, которые являются дыней или арбузом*/
        Map<String, Fruit> melonAndWatermelon = new HashMap<>();
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            if (pair.getValue().getName().equals("Арбуз") || pair.getValue().getName().equals("Дыня")) {
                melonAndWatermelon.put(pair.getKey(), pair.getValue());
            }
        }

        System.out.println();
        for (Map.Entry<String, Fruit> pair : melonAndWatermelon.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println();

        /*Найти средний вес всех фруктов*/
        int weight = 0;
        for (Map.Entry<String, Fruit> pair : newFruit.entrySet()) {
            weight = pair.getValue().getWeight() + weight;
        }
        System.out.println(weight / newFruit.size());

    }
}
