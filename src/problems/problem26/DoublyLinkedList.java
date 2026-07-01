package problems.problem26;

public class DoublyLinkedList<T> {
    static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    Node<T> head;
    Node<T> tail;

    void add(int index, T value) throws IndexOutOfBoundsException {
        Node<T> node = new Node<>(value);

        if (head == null) {
            throwIndexOutOfBounds(index != 0);
            makeHead(node);
            tail = node;
        } else if (index == 0) {
            makeHead(node);
        } else {
            Node<T> temp = getNode(index - 1);
            node.previous = temp;
            node.next = temp.next;
            if (temp.next != null) {
                temp.next.previous = node;
            } else {
                tail = node;
            }
            temp.next = node;
        }
    }

    T remove(int index) throws IndexOutOfBoundsException {
        T returnValue;
        throwIndexOutOfBounds(head == null);
        throwIndexOutOfBounds(head == tail && index != 0);
        if (index == 0) {
            returnValue = head.value;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                makeHead(getNode(index + 1));
            }
        } else {
            Node<T> temp = getNode(index);
            returnValue = temp.value;
            temp.previous.next = temp.next;
            if (temp != tail) {
                temp.next.previous = temp.previous;
            }
        }
        return returnValue;
    }

    void set(int index, T value) {

    }

    T get(int index) {
        throwIndexOutOfBounds(head == null);
        return getNode(index).value;
    }

    void throwIndexOutOfBounds(boolean condition) {
        if (condition) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void makeHead(Node<T> node) {
        node.previous = null;
        node.next = head;
        if (head != null) {
            head.previous = node;
        }
        head = node;
    }

    private Node<T> getNode(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            throwIndexOutOfBounds(node.next == null);
            node = node.next;
        }
        return node;
    }

}
