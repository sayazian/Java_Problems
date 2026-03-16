import java.util.Collection;
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

//        for (T i : c) {
//            s;
//        }
//
//        Iterator<T> iter = c.iterator();
//        while (iter.hasNext()) {
//            T i = iter.next();
//            s;
//        }
    }

//        Given a collection and a second collection, check
//        if all members of the second collection are included in the first collection
//    public static <T> boolean containsCollection(Collection<T> collection, Collection<T> collection2) {
//        Iterator<T> iterator = collection.iterator();
//        Iterator<T> iterator2 = collection2.iterator();
//        boolean containsCollection = false;
//        while (iterator2.hasNext()) {
//            T i = iterator2.next();
//            while (iterator.hasNext()) {
//                T j = iterator.next();
//                if (i.equals(j)) {
//                    containsCollection = true;
//                    break;
//                }
//                if (!iterator.hasNext()) {
//                    containsCollection = false;
//                }
//            }
//            if (!containsCollection) break;
//        }
//        return containsCollection;
//    }

    public static <T> boolean containsCollection(Collection<T> collection, Collection<T> collection2) {
        Iterator<T> iterator2 = collection2.iterator();
        int count = 0;
        int size = 0;
        if(!collection2.isEmpty()) {
            while (iterator2.hasNext()) {
                Iterator<T> iterator = collection.iterator();
                size++;
                T i = iterator2.next();
                while (iterator.hasNext()) {
                    T j = iterator.next();
                    if (i.equals(j)) {
                        count++;
                    }
                }
            }
            return count == size;
        }
        return false;
    }

}
