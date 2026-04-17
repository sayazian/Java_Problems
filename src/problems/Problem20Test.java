package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem20Test {

    @Test
    void factorialStackTest() {
        assertEquals(6, Problem20.factorialStack(3));
        assertEquals(1, Problem20.factorialStack(1));
        assertEquals(1, Problem20.factorialStack(0));
        assertEquals(24, Problem20.factorialStack(4));
        assertEquals(120, Problem20.factorialStack(5));
    }
}
