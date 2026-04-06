package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {

    @Test
    void producePrimeNumbers() {
        assertEquals(List.of(2, 3), Problem10.producePrimeNumbers(4));
        assertEquals(List.of(2, 3, 5), Problem10.producePrimeNumbers(5));
        assertEquals(List.of(2, 3, 5), Problem10.producePrimeNumbers(6));
        assertEquals(List.of(2, 3, 5, 7), Problem10.producePrimeNumbers(7));
        assertEquals(List.of(2, 3, 5, 7), Problem10.producePrimeNumbers(10));
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), Problem10.producePrimeNumbers(20));
    }
}
