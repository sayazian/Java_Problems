package problems.problem26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Queue<Integer> q = new Queue<>();
        q.enqueue(1);
        assertEquals(1,q.peek());
    }

    @Test
    void dequeue() {
    }

    @Test
    void testPeek0() {
        Queue<Integer> q = Framework.queueLengthZero();
        assertThrows(NullPointerException.class, q::peek);
    }

    @Test
    void testPeek1() {
        Queue<Integer> q = Framework.queueLengthOne();
        assertEquals(1, q.peek());
    }

    @Test
    void testPeek2() {
        Queue<Integer> q = Framework.queueLengthTwo();
        assertEquals(2, q.peek());
    }

    @Test
    void isEmpty() {
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
