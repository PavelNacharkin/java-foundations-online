package ru.itsjava.collections.lists.linkedlist;


public class MyLinkedList {
    private Node head;

    public int size() {
        int count = 1;
        if (head == null) {
            return 0;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                count++;
                curNode = curNode.getNext();
            }
        }
        return count;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }

        return false;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }
        if (curNode.getValue().equals(o) || head.getValue().equals(o)) {
            return true;
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        checkIndex(index);
        if (index==0){
            Object resValue = head.getValue();
            if (head.getNext()==null)
            head=null;
        }
        return null;
    }
    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index <= size())) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
