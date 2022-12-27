package ru.itsjava.collections.sets.setHW;

import ru.itsjava.collections.sets.Man;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetHW {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Яблоко", 500);
        Fruit banana = new Fruit("Банан", 300);
        Fruit pineapple = new Fruit("Ананас", 850);

        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(apple, banana, pineapple));
        System.out.println("manSet.add(pineapple) = " + fruitSet.add(pineapple));

        System.out.println("fruitSet.remove(pineapple) = " + fruitSet.remove(pineapple));
        System.out.println("fruitSet.contains(pineapple) = " + fruitSet.contains(pineapple));
        System.out.println("fruitSet.contains(apple) = " + fruitSet.contains(apple));
        System.out.println("fruitSet = " + fruitSet);
    }
}
