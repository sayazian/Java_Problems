package problems;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Problem13 {

    public static <T> T reduceIterative(Iterable<T> list, T initial, BiFunction<T, T, T> operator) {
        T result = initial;
        for (T t : list) {
            result = operator.apply(result, t);
        }
        return result;
    }

    public static Integer sum(List<Integer> list) {
        return reduce(list, 0, Integer::sum);
    }

    public static String join(List<String> list) {
        return reduce(list, "", (s1, s2) -> s1 + s2);
    }

    public static String join(List<String> list, String separator) {
        if (!list.isEmpty()) {
            return reduce(list.subList(1, list.size()), list.getFirst(), (s1, s2) -> s1 + separator + s2);
        } else {
            return "";
        }
    }

    public static int factorial(int n) {
        return reduce(IntStream.rangeClosed(1, n).boxed().toList(), 1, (a, b) -> a * b);
    }

    public static <T> T reduceList(List<T> list, T initial, BiFunction<T, T, T> operator) {
        if (!list.isEmpty()) {
             return reduceList(list.subList(1, list.size()), operator.apply(initial, list.getFirst()), operator);
        } else {
            return initial;
        }
    }

    public static <T> T reduce(Iterable<T> list, T initial, BiFunction<T, T, T> operator) {
        return reduce(list.iterator(), initial, operator);
    }
    public static <T> T reduce(Iterator<T> list, T initial, BiFunction<T, T, T> operator) {
        if (list.hasNext()) {
            return reduce(list, operator.apply(initial, list.next()), operator);
        } else {
            return initial;
        }
    }

}
