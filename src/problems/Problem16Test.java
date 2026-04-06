package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem16Test {

    @Test
    void rangeCopy() {
        int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] destination = new int[]{11, 12, 13, 14, 15, 16};
        int sourceIndex = 2;
        int destinationIndex = 2;
        int length = 3;
        int[] expected = new int[]{11, 12, 3, 4, 5, 16};
        Problem16.rangeCopy(source, sourceIndex, destination, destinationIndex, length);
        assertArrayEquals(expected, destination);
    }

    @Test
    void rangeCopyXX() {
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Problem16.rangeCopy(a1, 2, a1, 3, 5);
        assertArrayEquals(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 9}, a1);
    }

    @Test
    void rangeCopyYY() {
        int[] a2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Problem16.rangeCopy(a2, 3, a2, 2, 5);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7, 8, 8, 9}, a2);
    }
}
