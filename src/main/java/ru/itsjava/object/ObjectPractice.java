package ru.itsjava.object;

public class ObjectPractice {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1 == object2);
        System.out.println("object1.equals(object2) = " + object1.equals(object2));
        object2 = object1;
        System.out.println("object1.equals(object2) = " + object1.equals(object2));

        Dog djimbo = new Dog("Джимбо", 4);
        Dog djimbo2 = new Dog("Джимбо", 3);
        Dog fraer = new Dog("Фраер", 4);

        System.out.println("djimbo.equals(djimbo2) = " + djimbo.equals(djimbo2));
        System.out.println("djimbo.equals(fraer) = " + djimbo.equals(fraer));

        System.out.println("djimbo.toString() = " + djimbo);

        System.out.println(djimbo);

        System.out.println("djimbo2.getNickname() = " + djimbo2.getNickname());
    }
}
