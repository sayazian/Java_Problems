package problems.problem26;

public class Queue<T> {
    Node<T> head;
    Node<T> tail;

    static class Node<T> {
        T value;
        Node<T> next;
    }

    public void enqueue(T value) {
        if (head == null) {
            head = new Node<T>();
            head.value = value;
            tail = head;
            head.next = tail;
        } else {
            Node<T> node = new Node<>();
            node.value = value;
            node.next = head;
            head = node;
            tail.next = head;
        }
    }

    public T dequeue(){
        return null;
    }

    public T peek() throws NullPointerException {
        if (head == null) {
            throw new NullPointerException();
        }
        return head.value;
    }

    public boolean isEmpty() {
        return false;
    }
}

