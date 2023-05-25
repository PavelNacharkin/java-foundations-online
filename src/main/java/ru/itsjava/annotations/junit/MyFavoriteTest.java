package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.annotatoins.*;

public class MyFavoriteTest {
    @DisplayName(testMessage = "Метод перед всеми тестами")
    @BeforeAll
    public void beforeAllMethod() {
        System.out.println("BEFORE ALL");
    }

    @DisplayName(testMessage = "Метод перед каждым тестом")
    @Before
    public void beforeMethod() {
        System.out.println("BEFORE");
    }

    @DisplayName(testMessage = "Тест №1")
    @Test
    public void test1() {
    }

    @DisplayName(testMessage = "Тест №2")
    @Test
    public void test2() {
    }

    @DisplayName(testMessage = "Тест №3")
    @Test
    public void test3() {

        throw new RuntimeException();
    }

    @DisplayName(testMessage = "Тест №4")
    @Test
    public void test4() {
        throw new RuntimeException();
    }

    @DisplayName(testMessage = "Метод после каждого теста")
    @After
    public void afterMethod() {
        System.out.println("AFTER");
    }

    @DisplayName(testMessage = "Метод после всех тестов")
    @AfterAll
    public void afterAllMethod() {
        System.out.println("AFTER All");
    }

    public void noTestMethod() {
    }

}
