package problems;// copy length ints from source at sourceIndex to destination at destinationIndex
// you may assume that the indexes and length are valid

public class Problem16 {
    public static void rangeCopy(int[] source, int sourceIndex, int[] destination, int destinationIndex, int length) {
        if (destinationIndex < sourceIndex) {
            for (int i = 0; i < length; i++) {
                destination[destinationIndex + i] = source[sourceIndex + i];
            }
        } else {
            for (int i = length - 1; i >= 0; i--) {
                destination[destinationIndex + i] = source[sourceIndex + i];
            }
        }
    }
}
