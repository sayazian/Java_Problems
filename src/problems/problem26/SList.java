package problems.problem26;

public interface SList<T> {
    int length();
    void set(int index, T item) throws IndexOutOfBoundsException;
    T get(int index) throws IndexOutOfBoundsException;
    void add(int index, T item) throws IndexOutOfBoundsException;
    T remove (int index) throws IndexOutOfBoundsException;
}
