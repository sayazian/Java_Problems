package problems.problem26;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CircularQueueTest {

    @Test
    void enqueue() {
        CircularQueue<Integer> q = Framework.queueLengthZero();
        assertThrows(NoSuchElementException.class, q::dequeue);
        q.enqueue(1);
        assertEquals(1, q.peek());
        q.enqueue(2);
        assertEquals(1, q.peek());
    }

    @Test
    void dequeue0() {
        CircularQueue<Integer> q = Framework.queueLengthZero();
        assertThrows(NoSuchElementException.class, q::dequeue);
    }

    @Test
    void dequeue1() {
        CircularQueue<Integer> q = Framework.queueLengthOne();
        assertEquals(1, q.dequeue());
        assertThrows(NoSuchElementException.class, q::peek);
        assertTrue(q.isEmpty());
    }

    @Test
    void dequeue2() {
        CircularQueue<Integer> q = Framework.queueLengthTwo();
        assertEquals(1, q.dequeue());
        assertEquals(2, q.peek());
        assertEquals(2, q.dequeue());
        assertThrows(NoSuchElementException.class, q::dequeue);
        assertThrows(NoSuchElementException.class, q::dequeue);
        assertTrue(q.isEmpty());
    }

    @Test
    void dequeue3() {
        CircularQueue<Integer> q = Framework.queueLengthThree();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        assertEquals(1, q.peek());
        assertEquals(1, q.dequeue());
        assertEquals(2, q.peek());
        assertEquals(2, q.dequeue());
        assertEquals(3, q.peek());
        assertEquals(3, q.dequeue());
        assertEquals(4, q.peek());
        assertEquals(4, q.dequeue());
        assertEquals(5, q.peek());
        assertEquals(5, q.dequeue());
        assertEquals(6, q.peek());
        assertEquals(6, q.dequeue());
        assertThrows(NoSuchElementException.class, q::peek);
        assertThrows(NoSuchElementException.class, q::dequeue);
        assertTrue(q.isEmpty());
    }

    @Test
    void dequeue4() {
        CircularQueue<Integer> q = Framework.queueLengthZero();
        q.enqueue(1);
        q.enqueue(2);
        q.dequeue();
        q.enqueue(3);
        assertEquals(2, q.peek());
        assertEquals(2, q.dequeue());
        assertEquals(3, q.peek());
        assertEquals(3, q.dequeue());

    }


    @Test
    void testPeek0() {
        CircularQueue<Integer> q = Framework.queueLengthZero();
        assertThrows(NoSuchElementException.class, q::peek);
    }

    @Test
    void testPeek1() {
        CircularQueue<Integer> q = Framework.queueLengthOne();
        assertEquals(1, q.peek());
    }

    @Test
    void testPeek2() {
        CircularQueue<Integer> q = Framework.queueLengthTwo();
        assertEquals(1, q.peek());
    }

    @Test
    void testIsEmpty0() {
        CircularQueue<Integer> q = Framework.queueLengthZero();
        assertTrue(q.isEmpty());
    }

    @Test
    void testIsEmpty1() {
        CircularQueue<Integer> q = Framework.queueLengthOne();
        assertFalse(q.isEmpty());
    }

    @Test
    void cycleTest() {
        CircularQueue<Integer> q = Framework.queueLengthThree();
        assertEquals(1, q.peek());
        assertEquals(1, q.dequeue());
        assertEquals(2, q.peek());
        assertEquals(2, q.dequeue());
        assertEquals(3, q.peek());
        assertEquals(3, q.dequeue());
        assertTrue(q.isEmpty());
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        assertFalse(q.isEmpty());
        assertEquals(11, q.peek());
        assertEquals(11, q.dequeue());
        assertEquals(12, q.dequeue());
        assertEquals(13, q.dequeue());
        assertTrue(q.isEmpty());
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(16);
        assertFalse(q.isEmpty());
        assertEquals(14, q.peek());
        assertEquals(14, q.dequeue());
        assertEquals(15, q.peek());
        assertEquals(15, q.dequeue());
        assertEquals(16, q.peek());
        assertEquals(16, q.dequeue());
        assertTrue(q.isEmpty());
    }

    static class Framework {
        static CircularQueue<Integer> queueLengthZero() {
            return new CircularQueue<>();
        }

        static CircularQueue<Integer> queueLengthOne() {
            CircularQueue<Integer> q = new CircularQueue<>();
            q.enqueue(1);
            return q;
        }

        static CircularQueue<Integer> queueLengthTwo() {
            CircularQueue<Integer> q = new CircularQueue<>();
            q.enqueue(1);
            q.enqueue(2);
            return q;
        }

        static CircularQueue<Integer> queueLengthThree() {
            CircularQueue<Integer> q = new CircularQueue<>();
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            return q;
        }

    }
}
