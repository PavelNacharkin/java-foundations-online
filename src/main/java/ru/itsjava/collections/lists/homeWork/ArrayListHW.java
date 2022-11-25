package ru.itsjava.collections.lists.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
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

        System.out.print("List:[");
        for (Books elementBooks : booksList) {
            System.out.println(elementBooks + " ");
        }
        System.out.println();


        System.out.println("Домашняя работа №2");

        System.out.println("Хаотично добавить 4 книги с названием Java");
        Books java = new Books("Java", "David Thomas", 432);
        Books javaLang = new Books("Java", "Andrew Hunt", 125);
        Books javaBook = new Books("Java", "Steve McConnell", 210);
        Books javaStudy = new Books("Java", "Richard Helm", 321);

        List<Books> newBooksList = new ArrayList<>(Arrays.asList(javaBook, java, javaStudy, javaLang));
        myBooksList.addAll(newBooksList);
        System.out.println("newBooksList = " + newBooksList);
        System.out.println("myBooksList = " + myBooksList);

        System.out.println("Отфильтровать список вернуть записи по некоторому условию:");

        System.out.println("а) Условие на индекс: Индекс делится на 3");
        for (int i = 0; i < myBooksList.size(); i++) {
            if ((i % 3) == 0) {
                System.out.print(myBooksList.get(i));
            }
        }
        System.out.println("б) Условие на значение: Вернуть количество книг, которые равны Java");
        int count = 0;
        for (int i = 0; i < myBooksList.size(); i++) {
            if (myBooksList.get(i).getBookTitle().equals("Java")) {
                count++;
            }
        }
        System.out.println("Количество книг, которые равны Java: " + count);
        System.out.println();
        System.out.println("Пропустить первые 3 книги в списке");
        int countBooks = 0;
        for (int i = 0; i < myBooksList.size(); i++) {
            countBooks++;
            if (countBooks > 3) {
                System.out.print(myBooksList.get(i));

            }
        }

        System.out.println("Пропускаем элементы, которые удовлетворяют некоторому условию");
        int myCount = 0;
        for (int i = 0; i < myBooksList.size(); i++) {
            if (myBooksList.get(i).getBookTitle().equals("Java") && myCount < 2) {
                myCount++;
            } else
                System.out.println(myBooksList.get(i));
        }

        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
        for (int i = 0; i < myBooksList.size(); i++) {
            if (myBooksList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(myBooksList.get(i));
                break;
            }
        }

        for (int i = 0; i < myBooksList.size(); i++) {
            System.out.println("Длина: " + myBooksList.get(i).getAuthor().length() + " " + "Автор: " + myBooksList.get(i).getAuthor());
        }
        System.out.println();
        System.out.println("а) Возвращаем все книги, длина автора которых делится на 3");
        for (int i = 0; i < myBooksList.size(); i++) {
            if (myBooksList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(myBooksList.get(i));
            }
        }
        System.out.println("Создать класс Person.( Поля: имя, возраст и пол isMale )");
        Person pavel = new Person("Павел", 25, "male");
        Person nikolai = new Person("Николай", 19, "male");
        Person nika = new Person("Ника", 21, "female");
        Person nikita = new Person("Никита", 28, "male");
        Person nadya = new Person("Надя", 18, "female");
        List<Person> personList = new ArrayList<>(Arrays.asList(nadya, nika, nikolai, pavel, nikita));
        System.out.println("Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'");

        for (int i = 0; i < personList.size(); i++) {
            Person index = personList.get(i);
            if (index.getGender().equals("male")
                    && (index.getAge() > 17 && index.getAge() < 28)
                    && index.getName().charAt(0) == 'Н') {
                System.out.println(index);
            }
        }
        System.out.println("Найти средний возраст всех женщин");
        int femaleAge = 0;
        for (int i = 0; i < personList.size(); i++) {
            Person index = personList.get(i);
            if (index.getGender().equals("female")) {
                femaleAge += index.getAge();
            }
        }
        System.out.println("Общий возраст всех женщин: " + femaleAge);
    }
}


