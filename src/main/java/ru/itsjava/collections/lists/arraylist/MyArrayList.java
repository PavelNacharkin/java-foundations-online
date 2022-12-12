package ru.itsjava.collections.lists.arraylist;

public class MyArrayList {
    public static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }


    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }

        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }

    }

    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

    public Object get(int index) {
        checkIndex(index);
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                return array[i];
            }
        }
        return null;
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = element;
            }
        }
        return null;
    }

    public void add(int index, Object element) {
        checkIndex(index);
        realSize++;
        if (realSize >= 0) {
            System.arraycopy(array, index, array, index + 1, realSize);
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    array[i] = element;
                }
            }
        }
    }

    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];

        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }


    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = realSize - 1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

