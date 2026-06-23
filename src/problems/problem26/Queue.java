package problems.problem26;

import java.util.NoSuchElementException;

public class Queue<T> {
    Node<T> head;
    Node<T> tail;

    static class Node<T> {
        T value;
        Node<T> next;

        Node() {
        }

        Node(T value) {
            this.value = value;
        }
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else if (head.next == null) {
            tail = node;
            head.next = tail;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public T dequeue() throws NoSuchElementException {
        throwNoSuchElementException(head == null);
        Node<T> node = head.next;
        T returnValue = head.value;
        head = node;
        if (head == tail) {
            tail = null;
        }
        return returnValue;
    }

    public T peek() throws NoSuchElementException {
        throwNoSuchElementException(head == null);
        return head.value;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    private void throwNoSuchElementException(boolean condition) {
        if (condition) {
            throw new NoSuchElementException();
        }
    }

}

