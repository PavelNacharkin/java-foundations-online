package ru.itsjava.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;


    public void birthday() {
        int nextAge = age + 1;
        this.age = nextAge;
        System.out.println("после др тебе будет" + age);
    }
    public boolean takeBeer(){
        if (age >=18) return true;
        return false;
    }
}
