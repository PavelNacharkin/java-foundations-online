package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        System.out.println("list.size() = " + list.size());

        list.add("Привет");
        list.add("Пока");

        System.out.println("После добавления двух элементов размер равен: " + list.size());

        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");

        System.out.println("После добавления четырех элементов размер равен: " + list.size());
        System.out.println(list);


        MyArrayList list1 = new MyArrayList();

        System.out.println("list1.isEmpty() = " + list1.isEmpty());
        list1.add("Домашняя работа");
        System.out.println("list1.isEmpty() = " + list1.isEmpty());


        System.out.println(list1.contains("Домашняя работа"));
        System.out.println(list1.contains("Java"));
        list1.add("Java");
        System.out.println(list1.contains("Java"));


        list1.clear();
        System.out.println("list1 = " + list1);


        System.out.println("list.remove(\"Привет\") = " + list.remove("Привет"));
        System.out.println("list = " + list);
        list.remove("Пока");
        System.out.println("list = " + list);


        list.add("До_свидания");
        System.out.println("list = " + list);
        list.remove(4);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        list.remove(2);
        System.out.println("list = " + list);


        list1.add("element1");
        list1.add("element2");
        list1.add("element3");
        list1.add("element4");
        list1.remove(1);
        System.out.println("list1 = " + list1);
        list1.remove(0);
        System.out.println("list1 = " + list1);
        list1.remove("element3");
        System.out.println("list1 = " + list1);


        list1.clear();
        list1.add("element1");
        list1.add("element2");
        list1.add("element3");
        list1.add("element4");


        System.out.println("list1.get(0) = " + list1.get(0));
        System.out.println("list1.get(2) = " + list1.get(2));
        list1.set(1, "Element_5");
        System.out.println("list1 = " + list1);
        list1.set(3, "Its_Java");
        System.out.println("list1 = " + list1);
        list1.add(0, "Что_то_пробую");
        System.out.println("list1 = " + list1);
        list1.add(2, " Замена_на_3_позиции");
        System.out.println("list1 = " + list1);
        list1.add("Its_Java");
        System.out.println("list1 = " + list1);
        System.out.println("list1.indexOf(\"Its_Java\") = " + list1.indexOf("Its_Java"));


        list.clear();
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.lastIndexOf(\"Пока\") = " + list.lastIndexOf("Пока"));

    }
}