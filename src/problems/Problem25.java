package problems;

import java.util.ArrayList;
import java.util.List;

// Write zip: it takes two lists and alternates elements between two lists and creates a list
// Example: List1 = {1, 2, 3, 4} and List2 = {a, b, c, d}
// the result is {1, a, 2, b, 3, c, 4, d}
public class Problem25 {
    public static <T> List zip (ArrayList<T> list1, ArrayList<T> list2) {
        List<T> output = new ArrayList<>();
        
        int i = 0;
        while (!list2.isEmpty()) {
            output.add(list1.get(i));
            output.add(list2.get(i));
            i++;
        }
        return new ArrayList<T>();
    }
}
