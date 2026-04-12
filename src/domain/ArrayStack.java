package domain;

import java.util.NoSuchElementException;

public class ArrayStack<T> implements Stack<T> {
    T[] array;
    T head;
    int size;

    public ArrayStack() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        if (array == null) {
            return true;
        } else {
            for (T t : array) {
                isEmpty = isEmpty && t == null;
            }
        }
        return isEmpty;
    }

    @Override
    public void push(T value) {
        if (size < array.length) {
            array[size] = value;
        } else if (size == array.length) {
            doubleTheArrayLength();
            array[size] = value;
        }
        head = array[size];
        size++;
    }

    private void doubleTheArrayLength() {
        T[] tempArray = (T[]) new Object[2 * array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
        head  = array[size];
    }

    @Override
    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException("The stack is empty!!");
        }
        return head;
    }

    @Override
    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException("The stack is empty!!");
        }
        size--;
        return array[size];
    }
}
