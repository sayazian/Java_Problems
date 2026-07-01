package problems.problem26;

import java.util.NoSuchElementException;

public class CircularQueue<T> {
    Node<T> tail;

    static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if (tail == null) {
            tail = node;
            tail.next = tail;
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
    }

    public T dequeue() throws NoSuchElementException {
        throwNoSuchElementException(tail == null);
        Node<T> node = tail.next;
        T returnValue = node.value;
        if (node == tail) {
            tail = null;
        } else {
            tail.next = node.next;
        }
        return returnValue;
    }

    public T peek() throws NoSuchElementException {
        throwNoSuchElementException(tail == null);
        return tail.next.value;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    private void throwNoSuchElementException(boolean condition) {
        if (condition) {
            throw new NoSuchElementException();
        }
    }

}

