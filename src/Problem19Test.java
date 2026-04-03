import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem19Test {

    @Test
    void accumulativeSum() {
        assertEquals(List.of(1, 2, 3, 4), Problem19.accumulativeSum(List.of(1, 1, 1, 1)));
        assertEquals(List.of(), Problem19.accumulativeSum(List.of()));
        assertEquals(List.of(3, 2, 6, 19, 10), Problem19.accumulativeSum(List.of(3, -1, 4, 13, -9)));
    }
}
