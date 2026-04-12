package domain;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayStackTest {

    @Test
    void isEmpty() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        assertTrue(arrayStack.isEmpty());
        arrayStack.push(1);
        assertFalse(arrayStack.isEmpty());
    }

    @Test
    void push() {

    }

    @Test
    void peek() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        assertThrows(NoSuchElementException.class, arrayStack::peek);
        arrayStack.push(1);
        assertEquals(1, arrayStack.peek());
        arrayStack.push(2);
        arrayStack.push(3);
        assertEquals(3, arrayStack.peek());
    }

    @Test
    void pop() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        assertThrows(NoSuchElementException.class, arrayStack::pop);
        arrayStack.push(1);
        arrayStack.push(2);
        assertEquals(2, arrayStack.pop());
        assertEquals(1, arrayStack.pop());
        assertThrows(NoSuchElementException.class, arrayStack::pop);
    }

    @Test
    void pushTest() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0; i < 100; i++) {
            arrayStack.push(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            assertEquals(i, arrayStack.pop(), "popped value should be equal to " + i);
        }
    }

}
