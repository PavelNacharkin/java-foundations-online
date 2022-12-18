package ru.itsjava.collections.lists.arrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Класс MyArrayListTest должен: ")
public class   MyArrayListTest {

    MyArrayList list = new MyArrayList();

    @DisplayName("Корректно возвращать количество обьктов в списке")
    @Test
    public void shouldHaveCorrectSize() {
        list.add("Привет");
        Assertions.assertEquals(1, list.size());
        list.add("Привет");
        list.add("Привет");
        Assertions.assertEquals(3, list.size());
    }


    @DisplayName("Корректно проверять наличие обьектов в списке")
    @Test
    public void shouldHaveCorrectIsEmpty() {
        Assertions.assertTrue(list.isEmpty());
        list.add("Привет");
        Assertions.assertFalse(list.isEmpty());
    }


    @DisplayName("Корректно проверять наличие конкретного обьекта в списке")
    @Test
    public void shouldHaveCorrectContains() {
        list.add("Привет");
        Assertions.assertTrue(list.contains("Привет"));
        Assertions.assertFalse(list.contains("Пока"));
    }


    @DisplayName("Корректно добавлять обьект в список")
    @Test
    public void shouldHaveCorrectAdd() {
        list.add("Привет");
        Assertions.assertEquals("Привет", list.get(0));
        Assertions.assertEquals(1, list.size());
    }


    @DisplayName("Корректно удалять обьект из список")
    @Test
    public void shouldHaveCorrectRemove() {
        list.add("Привет");
        Assertions.assertEquals(1, list.size());
        list.remove("Привет");
        Assertions.assertEquals(0, list.size());
    }


    @DisplayName("Корректно удалять все обьекты в списке")
    @Test
    public void shouldHaveCorrectClear() {
        list.add("Привет");
        list.add("Привет");
        list.clear();
        Assertions.assertEquals(0, list.size());
    }


    @DisplayName("Корректно возвращать обьект по индкесу")
    @Test
    public void shouldHaveCorrectGet() {
        list.add("Привет");
        list.add("Пока");
        Assertions.assertEquals("Привет", list.get(0));
        Assertions.assertEquals("Пока", list.get(1));
    }


    @DisplayName("Корректно заменять обьект по индексу")
    @Test
    public void shouldHaveCorrectSet() {
        list.add("Привет");
        list.add("Привет");
        list.set(0, "Здравствуй");
        list.set(1, "Добрый_день");
        Assertions.assertEquals("Здравствуй", list.get(0));
        Assertions.assertEquals("Добрый_день", list.get(1));
    }


    @DisplayName("Корректно добавлять обьект в индекс")
    @Test
    public void shouldHaveCorrectAddToIndex() {
        list.add(0, "Привет");
        Assertions.assertEquals("Привет", list.get(0));
        list.add(0, "Пока");
        Assertions.assertEquals("Пока", list.get(0));
    }


    @DisplayName("Корректно удалять обьект по индексу")
    @Test
    public void shouldHaveCorrectRemoveToIndex() {
        list.add("Привет");
        list.add("Пока");
        list.remove(0);
        Assertions.assertEquals("Пока", list.get(0));

    }


    @DisplayName("Корректно возвращать индекс при первом нахождении обьекта в списке")
    @Test
    public void shouldHaveCorrectIndexOf() {
        list.add("Привет");
        list.add("Пока");
        list.add("Привет");
        Assertions.assertEquals(1, list.indexOf("Пока"));
    }


    @DisplayName("Корректно возвращать индекс при последнем нахождении обьекта в списке")
    @Test
    public void shouldHaveCorrectLastIndexOf() {
        list.add("Привет");
        list.add("Пока");
        list.add("Привет");
        Assertions.assertEquals(2, list.lastIndexOf("Привет"));
    }
}
