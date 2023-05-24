package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.annotatoins.*;

public class MyFavoriteTest {
    @DisplayName(testMessage = "Method before all tests")
    @BeforeAll
    public void beforeAllMethod() {
        System.out.println("BEFORE ALL");
    }

    @DisplayName(testMessage = "Method before each test")
    @Before
    public void beforeMethod() {
        System.out.println("BEFORE");
    }

    @DisplayName(testMessage = "Test #1")
    @Test
    public void test1() {
    }

    @DisplayName(testMessage = "Test #2")
    @Test
    public void test2() {
    }

    @DisplayName(testMessage = "Test #3")
    @Test
    public void test3() {

        throw new RuntimeException();
    }

    @DisplayName(testMessage = "Test #4")
    @Test
    public void test4() {
        throw new RuntimeException();
    }

    @DisplayName(testMessage = "Method after each test")
    @After
    public void afterMethod() {
        System.out.println("AFTER");
    }

    @DisplayName(testMessage = "Method after all tests")
    @AfterAll
    public void afterAllMethod() {
        System.out.println("AFTER All");
    }

    public void noTestMethod() {
    }

}
