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
        Node curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }
        curNode.setNext(null);
        head = null;
    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА 2 ->СТРОКА3 -> null
    public Object remove(int index) {
        checkIndex(index);/* Проверка корректности индекса */
        if (index == 0) {/* Если инедкс равен 0 то -> */
            Object resValue = head.getValue();/* Создаем результирующий obj и присваеваем ему значение head */
            if (head.getNext() == null) {/* если у head ссылка на след obj равна null, то head один в этом списке*/
                head = null;/* удаляем head присваивая ему null */
            } else {/* если head не один obj в списке то переходим на след. obj*/
                head = head.getNext();/* переходим на следующий элемент */
            }
            return resValue;
        }
        Node cureNode = head;/* создаем текущий элемент */
        Node prevNode = head;/*создаем предыдущий элемент */

        int count = 0;/* счетчик индекса*/
        while ((cureNode = cureNode.getNext()) != null) {/* бежим по списку с первого передвигая curNode на след.*/
            count++;/* пробегаясь по элементам добавляем к count +1 */
            if (count == index) {/* когда найдем позицию элемента с числом count соответствующую входящему индексу*/
                break;/*выходим из цикла когда нашли позицию элемента*/
            }
            prevNode = prevNode.getNext();/* передвигаем значение prevNode на след.*/
        }
        Object resValue = cureNode.getValue();/* присваиваем результ. obj  значение текущего элемента*/

        if (cureNode.getNext() == null) {/* если следующий элемент = null, то ->*/
            prevNode.setNext(null);/* у предыдущего элемента убираем ссылку на  элемент*/

        } else {
            prevNode.setNext(cureNode.getNext());/* предыдущему элементу меняем ссылку на след. взяв ее у текущего элемента*/
            cureNode.setNext(null);/* удаляем у текущего элемента ссылку на след.*/
        }
        return resValue;/* возвращаем */

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
