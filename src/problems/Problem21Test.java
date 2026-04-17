package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem21Test {

    @Test
    void fibonacciTest() {
        assertEquals(0, Problem21.fibonacci(0));
        assertEquals(1, Problem21.fibonacci(1));
        assertEquals(1, Problem21.fibonacci(2));
        assertEquals(2, Problem21.fibonacci(3));
        assertEquals(3, Problem21.fibonacci(4));
        assertEquals(5, Problem21.fibonacci(5));
        assertEquals(8, Problem21.fibonacci(6));
    }
}
