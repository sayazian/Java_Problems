import java.util.ArrayList;
import java.util.List;

// Given a list of numbers return a list of the same size where each element is the sum of the elements before the number
// [1 1 1 1] returns [1 2 3 4]
public class Problem19 {
    public static List<Integer> accumulativeSum(List<Integer> input) {
        int sum = 0;
//        When we assign the size, the output array does not need to do any re-allocation
//        ArrayList<Integer> output = new ArrayList<>(input.size());
        ArrayList<Integer> output = new ArrayList<>();
//        Or use this method. It throws away the old array if it is smaller than this size.
        output.ensureCapacity(input.size());
        for (Integer element : input) {
            sum += element;
            output.add(sum);
        }
        return output;
    }

//    firstNSquares returns a list of the first N squares
//    restriction: don't use multiplication
//    the nth square is the first n odd numbers summed
}
