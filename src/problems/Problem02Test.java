package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem02Test {

    @Test
    void findLastLongestString() {
        String[] strings = {"", "a   b", "hello world!"};
        assertEquals("hello world!", Problem02.findLastLongestString(strings));

        String[] strings2 = {""};
        assertEquals("", Problem02.findLastLongestString(strings2));

        String[] strings3 = {};
        assertNull(Problem02.findLastLongestString(strings3));

        String[] strings4 = {"", "a   b", "Sahar"};
        assertEquals("Sahar", Problem02.findLastLongestString(strings4));

    }

    @Test
    void findFirstLongestString() {
        String[] strings = {"", "a   b", "hello world!"};
        assertEquals("hello world!", Problem02.findFirstLongestString(strings));

        String[] strings2 = {""};
        assertEquals("", Problem02.findFirstLongestString(strings2));

        String[] strings3 = {};
        assertNull(Problem02.findFirstLongestString(strings3));

        String[] strings4 = {"", "a   b", "Sahar"};
        assertEquals("a   b", Problem02.findFirstLongestString(strings4));
    }

    @Test
    void findIndexOfFirstLongestString() {
        String[] strings = {"", "a   b", "hello world!"};
        assertEquals(2, Problem02.indexOfFirstLongestString(strings));

        String[] strings2 = {""};
        assertEquals(0, Problem02.indexOfFirstLongestString(strings2));

        String[] strings3 = {};
        assertEquals(-1, Problem02.indexOfFirstLongestString(strings3));

        String[] strings4 = {"", "a   b", "Sahar"};
        assertEquals(1, Problem02.indexOfFirstLongestString(strings4));
    }

    @Test
    void findIndexOfLastLongestString() {
        String[] strings = {"", "a   b", "hello world!"};
        assertEquals(2, Problem02.indexOfLastLongestString(strings));

        String[] strings2 = {""};
        assertEquals(0, Problem02.indexOfLastLongestString(strings2));

        String[] strings3 = {};
        assertEquals(-1, Problem02.indexOfLastLongestString(strings3));

        String[] strings4 = {"", "a   b", "Sahar"};
        assertEquals(2, Problem02.indexOfLastLongestString(strings4));
    }
}
