package problems;

// Find the smallest number that is the sum of two cubes in two different ways
// Taxicab number

import java.util.ArrayList;
import java.util.List;

public class Problem24 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int limit = 100;
        boolean found = false;
            for (int i = 1; i < limit; i++) {
                for (int j = i; j < limit; j++) {
                    int sum = (int)Math.pow(i, 3) + (int)Math.pow(j, 3);
                    if (list.contains(sum)) {
                        System.out.println(sum);
                        return;
                    }
                    list.add(sum);
                }
            }
    }
}
