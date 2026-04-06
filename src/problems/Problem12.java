package problems;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Problem12 {
    //    implement .contains() for lists
    public static <T> boolean contains(List<T> list, T item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) {
                return true;
            }
        }
        return false;
    }

    //    implement .contains() for Collection (it is a type, a utility class) list, vector, set
//    (it is different from collections which is also a type)
//    using enhanced for loop is the right way, but try it another way as well
    public static <T> boolean contains4(Collection<T> collection, T item) {
        Object[] colAsArray = collection.toArray();
        for (int i = 0; i < collection.size(); i++) {
            if (colAsArray[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contains2(Collection<T> collection, T item) {
        for (T i : collection) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contains3(Collection<T> collection, T item) {
        return collection.stream().anyMatch(x -> x.equals(item));
    }

    public static <T> boolean contains(Collection<T> collection, T item) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            T i = iterator.next();
            if (i.equals(item)) return true;
        }
        return false;
    }

    public static <T> boolean containsAllV1(Collection<T> collection, Collection<T> items) {
        for (T item : items) {
            if (!contains2(collection, item)) {
                return false;
            }
        }
        return true;
    }
    public static <T> boolean containsAll(Collection<T> collection, Collection<T> items) {
        return new HashSet<>(collection).containsAll(items);
    }
}

