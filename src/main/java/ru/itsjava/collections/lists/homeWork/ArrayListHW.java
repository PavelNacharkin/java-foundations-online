package ru.itsjava.collections.lists.homeWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHW {
    public static void main(String[] args) {
        List<Books> myBooksList = new ArrayList<Books>();
        List<Books> booksList = new ArrayList<Books>(20);

        Books coreJava = new Books("Core Java", "Cay S. Horstmann", 345);
        Books thinkingInJava = new Books("Thinking in Java", "Bruce Eckel", 617);
        Books javaConcurrencyInPractice = new Books("Java Concurrency in Practice", "Brian Goetz", 415);
        Books testDrivenDevelopment = new Books("Test Driven Development", "Kent Beck", 574);
        Books cleanCode = new Books("Clean Code", "Robert C. Martin", 953);

        booksList.add(coreJava);
        booksList.add(thinkingInJava);
        booksList.add(javaConcurrencyInPractice);
        booksList.add(testDrivenDevelopment);
        booksList.add(cleanCode);
        System.out.println("booksList = " + booksList);

        Books java8 = new Books("Java 8", "Robert Liguori", 451);
//        booksList.set(2, java8);  /*  заменить обьект удалив предыдущее значение*/
        booksList.add(2, java8);   /* поместить на указаные индекс при этом сместив массив в право*/

        Books headFirstJava = new Books("Head First Java", "Katie Sierra", 643);
//        booksList.set(0, headFirstJava);  /*заменить обьект удалив предыдущее значение*/
        booksList.add(0, headFirstJava);  /* поместить на указаные индекс при этом сместив массив в право*/

        myBooksList.addAll(booksList);

        System.out.println("myBooksList.get(0) = " + myBooksList.get(0));
        System.out.println("myBooksList.get(6) = " + myBooksList.get(6));

        myBooksList.remove(5);
        myBooksList.remove(coreJava);

        System.out.println("myBooksList.contains(coreJava) = " + myBooksList.contains(coreJava));
        System.out.println("myBooksList.contains(cleanCode) = " + myBooksList.contains(cleanCode));

//        System.out.print("list:" + booksList);
        System.out.print("List:[");
        for (Books elementBooks : booksList
        ) {
            System.out.println(elementBooks + " ");

        }
        System.out.println();
    }
}
