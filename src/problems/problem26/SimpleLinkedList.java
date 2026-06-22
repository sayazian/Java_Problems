package problems.problem26;

public class SimpleLinkedList<T> implements SList<T> {
    static class Node<T> {
        T value;
        Node<T> next;
    }

    Node<T> head;

    public int length() {
        int length = 0;
        Node<T> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void set(int index, T item) throws IndexOutOfBoundsException {
        getNode(index).value = item;
    }

    public void add(int index, T item) throws IndexOutOfBoundsException {
        if (index == 0) {
            Node<T> temp = new Node<>();
            temp.value = item;
            temp.next = head;
            head = temp;
        } else {
            Node<T> temp = getNode(index - 1);
            Node<T> node = new Node<>();
            node.value = item;
            node.next = temp.next;
            temp.next = node;
        }
    }

    public T remove(int index) throws IndexOutOfBoundsException {
        if (index == 0 && head != null) {
            T returnValue = head.value;
            head = head.next;
            return returnValue;
        } else {
            Node<T> node = getNode(index - 1);
            indexOutOfBoundException(node.next == null);
            T returnValue = node.next.value;
            node.next = node.next.next;
            return returnValue;
        }
    }

    public T get(int index) throws IndexOutOfBoundsException {
        return getNode(index).value;
    }

    private Node<T> getNode(int index) {
        indexOutOfBoundException(index < 0 || head == null);
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            indexOutOfBoundException(temp.next == null);
            temp = temp.next;
        }
        return temp;
    }

    private void indexOutOfBoundException(boolean index) {
        if (index) {
            throw new IndexOutOfBoundsException();
        }
    }

}

