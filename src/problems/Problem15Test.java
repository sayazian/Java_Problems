package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem15Test {

    @Test
    void sortArray() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Problem15.sortArray(new int[]{4, 2, 1, 3}));
    }
}
