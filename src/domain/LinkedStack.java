package domain;

public class LinkedStack<T> implements Stack<T> {

    Node[] nodes;

    @Override
    public boolean isEmpty() {

        return nodes.length == 0;
    }

    @Override
    public void push(T value) {

    }

    @Override
    public T peak() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }
    private class Node {
        T value;
        Node next;
    }

}
