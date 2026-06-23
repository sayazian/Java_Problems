package problems.problem26;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Queue<Integer> q = Framework.queueLengthZero();
        assertThrows(NoSuchElementException.class, () -> {q.dequeue();});
        q.enqueue(1);
        assertEquals(1,q.peek());
        q.enqueue(2);
        assertEquals(1,q.peek());
    }

    @Test
    void dequeue0() {
        Queue<Integer> q = Framework.queueLengthZero();
        assertThrows(NoSuchElementException.class, () -> {q.dequeue();});
    }

    @Test
    void dequeue1() {
        Queue<Integer> q = Framework.queueLengthOne();
        assertEquals(1, q.dequeue());
        assertThrows(NoSuchElementException.class, () -> {q.peek();});
        assertTrue(q.isEmpty());
    }

    @Test
    void dequeue2() {
        Queue<Integer> q = Framework.queueLengthTwo();
        assertEquals(1, q.dequeue());
        assertEquals(2, q.peek());
        assertEquals(2, q.dequeue());
        assertThrows(NoSuchElementException.class, () -> {q.peek();});
        assertThrows(NoSuchElementException.class, () -> {q.dequeue();});
        assertTrue(q.isEmpty());
    }

    @Test
    void dequeue3() {
        Queue<Integer> q = Framework.queueLengthThree();
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
    void testPeek0() {
        Queue<Integer> q = Framework.queueLengthZero();
        assertThrows(NoSuchElementException.class, q::peek);
    }

    @Test
    void testPeek1() {
        Queue<Integer> q = Framework.queueLengthOne();
        assertEquals(1, q.peek());
    }

    @Test
    void testPeek2() {
        Queue<Integer> q = Framework.queueLengthTwo();
        assertEquals(1, q.peek());
    }

    @Test
    void testIsEmpty() {
        Queue<Integer> q = Framework.queueLengthZero();
        assertTrue(q.isEmpty());
    }

    static class Framework {
        static Queue<Integer> queueLengthZero() {
            return new Queue<>();
        }

        static Queue<Integer> queueLengthOne() {
            Queue<Integer> q =  new Queue<>();
            q.enqueue(1);
            return  q;
        }

        static Queue<Integer> queueLengthTwo() {
            Queue<Integer> q =  new Queue<>();
            q.enqueue(1);
            q.enqueue(2);
            return  q;
        }

        static Queue<Integer> queueLengthThree() {
            Queue<Integer> q =  new Queue<>();
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            return  q;
        }

    }
}
