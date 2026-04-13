package domain;

import java.util.NoSuchElementException;

public class LinkedStack<T> implements Stack<T> {

    Node<T> head;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(T value) {
        if (head != null) {
            Node<T> newNode = new Node<>(value);
            newNode.next = head;
            head = newNode;
        } else {
            head = new Node<>(value);
        }
    }

    @Override
    public T peek() {
        if (head == null) {
            throw new NoSuchElementException("The stack is empty!!");
        }
        return head.value;
    }

    @Override
    public T pop() {
        T value = peek();
        head = head.next;
        return value;
    }

    protected static class Node<U> {
        U value;
        Node<U> next;

        public Node(U value) {
            this.value = value;
        }
    }

}
