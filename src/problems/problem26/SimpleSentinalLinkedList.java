package problems.problem26;

public class SimpleSentinalLinkedList<T> implements SList<T> {
    static class Node<T> {
        T value;
        Node<T> next;
    }

    final Node<T> head = new Node<>();

    public int length() {
        int length = 0;
        Node<T> temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void set(int index, T item) throws IndexOutOfBoundsException {
        indexOutOfBoundException(index < 0);
        getNode(index).value = item;
    }

    public void add(int index, T item) throws IndexOutOfBoundsException {
        Node<T> temp = getNode(index - 1);
        Node<T> node = new Node<>();
        node.value = item;
        node.next = temp.next;
        temp.next = node;
    }

    public T remove(int index) throws IndexOutOfBoundsException {
        Node<T> node = getNode(index - 1);
        indexOutOfBoundException(node.next == null);
        T returnValue = node.next.value;
        node.next = node.next.next;
        return returnValue;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        indexOutOfBoundException(index < 0);
        return getNode(index).value;
    }

    private Node<T> getNode(int index) {
        indexOutOfBoundException(index < -1);
        Node<T> temp = head;
        for (int i = -1; i < index; i++) {
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

