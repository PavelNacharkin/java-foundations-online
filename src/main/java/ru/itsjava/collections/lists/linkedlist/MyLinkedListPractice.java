package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.add("Строка 1");
        System.out.println("list = " + list);

        list.add("Строка 2");
        System.out.println("list = " + list);

        list.add("Строка 3");
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());

        System.out.println("list.isEmpty() = " + list.isEmpty());

        System.out.println("list.contains(\"Строка 1\") = " + list.contains("Строка 1"));
        System.out.println("list.contains(\"Строка 3\") = " + list.contains("Строка 3"));
        System.out.println("list.contains(\"Строка 4\") = " + list.contains("Строка 4"));
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list = " + list);
//        list.clear();
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
//
//        list.set(2, "Строка 5");

        System.out.println("list = " + list);
        list.remove("Строка 5");
        System.out.println("list = " + list);
        System.out.println("list.indexOf(\"Строка 3\") = " + list.indexOf("Строка 3"));
        list.add("Строка 2");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        System.out.println("list.lastIndexOf(\"Строка 2\") = " + list.lastIndexOf("Строка 2"));

        list.clear();
        list.add("Строка 1");
        list.add("Строка 1");

        System.out.println("list.lastIndexOf(\"Строка 1\") = " + list.lastIndexOf("Строка 1"));



    }

}
