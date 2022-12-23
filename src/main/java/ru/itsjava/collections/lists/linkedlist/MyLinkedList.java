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
        return head == null;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        if (curNode.getValue().equals(o)) return true;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
            if (curNode.getValue().equals(o)) return true;
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
        if (head == null) return false;/*проверяем,если head равен null, то возвращаем false */
        /*если список пуст то ничего не удалим*/
        if (head.getValue().equals(o)) {/*если список не пуст проверяем равно ли head удаляемому элементу */
            head = head.getNext();/* если да, то перемещаем указатель на след элемент,убрав ссылку на начальный head*/
            return true;/* возвращаем true, если условие выше выполнено*/
        }

        if (head.getNext() == null) return false;/*если head не равен элементу, то проверяем
        если после head еще элементы, если нет то возвращаем false */

        Node prevNode = head;/*создаем предыдущий элемент */
        Node cureNode = head;/*создаем текущий элемент */


        while ((cureNode = cureNode.getNext()) != null) {
            /* создаем цикл, чтобы бежать по списку и сразу перемещаем текущий элемент на 1 вперед*/
            if (cureNode.getValue().equals(o)) {/* сравниваем указатель текущего элемента с удаляемым */
                break;/* если нашли выходим из цикла*/
            }
            prevNode = prevNode.getNext();/* если не нашли перемещаем указатель предыдущего елемента на 1 */
        }
        if (cureNode == null)
            return false;/* если текущий указатель указывает на null, мы не сможем удалить и возвращаем false*/
        /* по завершению цикла имеем указатели на предыдущий и текущий элементы*/
        prevNode.setNext(cureNode.getNext());/*у текущего элемена берем ссылку на след и присваиваем ее предыдущему */
        cureNode.setNext(null);/* после чего у удаленого обьекта убираем сыылку на след элемент*/

        return true;
    }

    public void clear() {
        Node curNode = head;
        Node prevNode = head;
        while ((curNode = curNode.getNext()) != null) {
            prevNode.setNext(null);
            prevNode = curNode;
            head = null;
        }
    }

    public Object get(int index) {
        checkIndex(index);
        Node curNode = head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        Node curNode = head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        curNode.setValue(element);
        return curNode;

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
        if (cureNode == null) return null;
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
        if ((index > -1) && (index <= size() - 1)) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        if (head == null) return -1;
        if (head.getValue().equals(o)) return 1;
        int count = 1;
        Node curNode = head;
        while (curNode.getNext() != null) {
            count++;
            curNode = curNode.getNext();
            if (curNode.getValue().equals(o)) return count;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (head == null) return -1;
        Node cureNode = head;
        Node prevNode = head;
        int count = 1;
        int resIndex = 1;
        while (cureNode.getNext() != null) {
            count++;
            cureNode = cureNode.getNext();
            if (cureNode.getValue().equals(o)) {
                prevNode.setValue(cureNode);
                resIndex = count;
            }
        }
        return resIndex;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
