import java.util.ArrayList;
import java.util.List;

public class Problem07 {
    //    Take a list and reverse it
    public static <T> List<T> reverseList(List<T> list) {
        List<T> output = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            output.add(list.get(list.size() - 1 - i));
        }
//        for (int i = list.size() - 1; i >= 0; i--) {
//            output.add(list.get(i));
//        }
        return output;
    }

    //Iterative reversal
    public static <T> List<T> reverseListV2(List<T> list) {
        List<T> output = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            output.add(list.subList(list.size() - i - 1, list.size()).getFirst());
        }
        return output;
    }

    // Recursive
    public static <T> List<T> reverseListV3(List<T> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            List<T> output = new ArrayList<>();
            output.add(list.getLast());
            output.addAll(reverseListV3(list.subList(0, list.size() - 1)));
            return output;
        }
    }

    public static <T> List<T> reverseListV30(List<T> list) {
        if (list.isEmpty()) {
            return new ArrayList<>();
        } else {
            List<T> output = reverseListV30(list.subList(1, list.size()));
            output.add(list.getFirst());
            return output;
        }
    }

    //Iterative in place reversal
    public static <T> void reverseInPlace(List<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            swapElements(list, i);
        }
    }

    private static <T> void swapElements(List<T> list, int i) {
        T temp;
        temp = list.get(i);
        list.set(i, list.get(list.size() - 1 - i));
        list.set(list.size() - 1 - i, temp);
    }

}
