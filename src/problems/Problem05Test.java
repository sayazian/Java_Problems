package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem05Test {

    @Test
    void fibonacci() {
        assertEquals(0, Problem05.fibonacci(0));
        assertEquals(1, Problem05.fibonacci(1));
        assertEquals(1, Problem05.fibonacci(2));
        assertEquals(2, Problem05.fibonacci(3));
        assertEquals(3, Problem05.fibonacci(4));
        assertEquals(5, Problem05.fibonacci(5));
        assertEquals(8, Problem05.fibonacci(6));
        assertEquals(0, Problem05.fibonacci(-10));
    }

    @Test
    void fibonacci100k1() {
        int N = Problem05.fibonacci(100000000);
        assertEquals(1819143227, N);
    }

    @Test
    void fibonacci100k2() {
        int N = Problem05.fibonacciV1(100000000);
        assertEquals(1819143227, N);
    }

    @Test
    void calculate100kx100k() {
        assertEquals(10_000_000_000L, 100_000L * 100_000L);
    }
}
