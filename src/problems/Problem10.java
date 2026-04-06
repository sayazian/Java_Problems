package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {
    //    Produce all prime numbers smaller than 100
    public static List<Integer> producePrimeNumbers(int n) {
        List<Integer> output = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            if (!output.isEmpty()) {
                for (int j = 0; j < output.size(); j++) {
                    if(j < n / 2) {
                        if (i % output.get(j) == 0) {
                            isPrime = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (isPrime) {
                    output.add(i);
                }
            } else {
                output.add(i);
            }
        }
        return output;
    }

}
