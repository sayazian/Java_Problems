package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem13Test {

    @Test
    void testReduce() {
        int actual = Problem13.reduce(List.of(1, 2, 3, 4), 0, this::add);

        assertEquals(10, actual);
    }

    Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Test
    void testSum() {
        int actual = Problem13.sum(List.of(1, 2, 3, 4));

        assertEquals(10, actual);
    }

    @Test
    void testJoin() {
        String actual = Problem13.join(List.of("Hello", " ", "World", "!"));

        assertEquals("Hello World!", actual);
    }

    @Test
    void testJoinWithSeparator() {
        String actual = Problem13.join(List.of("Hello", "World!", "I", "am", "Sahar."), " ");

        assertEquals("Hello World! I am Sahar.", actual);
    }

    @Test
    void testFactorial() {
        assertEquals(6, Problem13.factorial(3));
        assertEquals(1, Problem13.factorial(1));
        assertEquals(1, Problem13.factorial(0));
    }
}
