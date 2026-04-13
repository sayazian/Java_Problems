package domain;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStack<T> implements Stack<T> {
    T[] array;
    int size;

    public ArrayStack() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(T value) {
        if (size < array.length) {
            array[size] = value;
        } else if (size == array.length) {
            doubleTheArrayLength();
            array[size] = value;
        }
        size++;
    }

    private void doubleTheArrayLength() {
        array = Arrays.copyOf(array, 2 * array.length);
    }

    @Override
    public T peek() {
        throwExceptionIfEmpty();
        return array[size - 1];
    }

    private void throwExceptionIfEmpty() {
        if (size == 0) {
            throw new NoSuchElementException("The stack is empty!!");
        }
    }

    @Override
    public T pop() {
        throwExceptionIfEmpty();
        size--;
        T temp = array[size];
        array[size] = null;
        return temp;
    }
}
