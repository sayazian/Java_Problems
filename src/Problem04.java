import java.util.Arrays;

public class Problem04 {

    //Add all odd integers in an array
    public static int addOddNumbers(int[] numbers) {
        int output = 0;
        for (int i = 0; i < numbers.length; i++) {
            output += numbers[i] % 2 == 0 ? 0 : numbers[i];
        }
        return output;
    }
}
