package ru.itsjava.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Person должен")
public class PersonTest {
    public static final String DEFAULT_NAME = "Pavel";
    public static final int DEFAULT_AGE = 18;

    @Test
    @DisplayName("корректно создаваться конструктором ")
    public void shouldHaveCorrectConstrucrtor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Assertions.assertEquals(DEFAULT_NAME, actualPerson.getName());
        Assertions.assertEquals(DEFAULT_AGE, actualPerson.getAge());
    }

    @Test
    @DisplayName("корректно добавлять к возрасту + 1 ")
    public void shouldCorrectIncreaseAge() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();
        Assertions.assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());
    }

    @Test
    @DisplayName("корректно проверять совершеннолетие ")
    public void shouldCorrectLegalAge() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();
        if (actualPerson.getAge() >= 18) {
            Assertions.assertEquals(actualPerson.takeBeer(), true);
        } else if (actualPerson.getAge() < 18) {
            Assertions.assertEquals(actualPerson.takeBeer(), false);
        }
    }
}
