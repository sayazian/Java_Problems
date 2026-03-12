import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem04Test {

    @Test
    void addOddNumbers() {
        assertEquals(4, Problem04.addOddNumbers(new int[]{1, 2, 3}));
        assertEquals(0, Problem04.addOddNumbers(new int[]{}));
        assertEquals(1, Problem04.addOddNumbers(new int[]{1}));
        assertEquals(0, Problem04.addOddNumbers(new int[]{2}));
        assertEquals(0, Problem04.addOddNumbers(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }
}
