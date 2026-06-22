package problems.problem26;

public class SimplePythonList<T> implements SList<T> {

    private final SList<T> delegate;

    SimplePythonList(SList<T> delegate) {
        this.delegate = delegate;
    }

    @Override
    public int length() {
        return delegate.length();
    }

    @Override
    public void set(int index, T item) throws IndexOutOfBoundsException {
        delegate.set(getAdjustedIndex(index), item);
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return delegate.get(getAdjustedIndex(index));
    }

    @Override
    public void add(int index, T item) throws IndexOutOfBoundsException {
        delegate.add(getAdjustedIndex(index), item);
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        return delegate.remove(getAdjustedIndex(index));
    }

    private int getAdjustedIndex(int index) {
        if (index < 0) {
            return index + length();
        }
        return index;
    }
}
