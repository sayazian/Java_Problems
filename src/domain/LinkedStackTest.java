package domain;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    @Test
    void isEmpty() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        assertTrue(linkedStack.isEmpty());
        linkedStack.push(1);
        assertFalse(linkedStack.isEmpty());
    }

    @Test
    void push() {

    }

    @Test
    void peek() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        assertThrows(NoSuchElementException.class, linkedStack::peek);
        linkedStack.push(1);
        assertEquals(1, linkedStack.peek());
        linkedStack.push(2);
        linkedStack.push(3);
        assertEquals(3, linkedStack.peek());
    }

    @Test
    void pop() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        assertThrows(NoSuchElementException.class, linkedStack::pop);
        linkedStack.push(1);
        linkedStack.push(2);
        assertEquals(2, linkedStack.pop());
        assertEquals(1, linkedStack.pop());
        assertThrows(NoSuchElementException.class, linkedStack::pop);
    }

    @Test
    void pushTest() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        for (int i = 0; i < 100; i++) {
            linkedStack.push(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            assertEquals(i, linkedStack.pop(), "popped value should be equal to " + i);
        }
    }
}
