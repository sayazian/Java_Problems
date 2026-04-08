package domain;

public interface Stack<T> {
    boolean isEmpty();
    void push(T value);
    T peak();
    T pop();
}
