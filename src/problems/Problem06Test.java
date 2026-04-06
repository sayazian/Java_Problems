package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem06Test {

    @Test
    void factorialRecursive() {
        assertEquals(1,Problem06.factorialRecursive(0));
        assertEquals(1, Problem06.factorialRecursive(-10));
        assertEquals(1, Problem06.factorialRecursive(1));
        assertEquals(6, Problem06.factorialRecursive(3));
        assertEquals(120, Problem06.factorialRecursive(5));
    }

    @Test
    void factorialIterative() {
        assertEquals(1,Problem06.factorialIterative(0));
        assertEquals(1, Problem06.factorialIterative(-10));
        assertEquals(1, Problem06.factorialIterative(1));
        assertEquals(6, Problem06.factorialIterative(3));
        assertEquals(120, Problem06.factorialIterative(5));
    }
}
