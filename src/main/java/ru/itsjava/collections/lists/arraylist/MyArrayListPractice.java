package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println("После добавления двух элементов размер равен: "
                + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("После добавления восьми элементов размер равен: "
                + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("После добавления пяти элементов размер равен: "
                + list.size());
        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        MyArrayList list1  = new MyArrayList();
        System.out.println("list1.isEmpty() = " + list1.isEmpty());
        list1.add("Домашняя работа");
        System.out.println("list1.isEmpty() = " + list1.isEmpty());
        System.out.println(list1.contains("Домашняя работа"));
        System.out.println(list1.contains("Java"));
        list1.add("Java");
        System.out.println(list1.contains("Java"));

        list1.clear();
        System.out.println("list1.isEmpty() = " + list1.isEmpty());
        System.out.println(list1);
        System.out.println("list1.size() = " + list1.size());
        list1.clear();
        System.out.println("list1.isEmpty() = " + list1.isEmpty());

    }
}
