package problems.problem26;
// I need to finish remove

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testAdd0() {
        DoublyLinkedList<Integer> list = Framework.doublyLinkedListLengthZero();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-10, 2222));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 2222));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(1, 2222));
        // -1, 1
        list.add(0, 100);
        assertEquals(100, list.get(0));
        // 2
        list.add(0, 200);
        assertEquals(200,list.get(0));
        assertEquals(100, list.get(1));
        list.add(2,300);
        assertEquals(200,list.get(0));
        assertEquals(100, list.get(1));
        assertEquals(300, list.get(2));
        list.add(1,400);
        assertEquals(200,list.get(0));
        assertEquals(400, list.get(1));
        assertEquals(100, list.get(2));
        assertEquals(300, list.get(3));
    }

    @Test
    void testRemove0() {
        DoublyLinkedList<Integer> list = Framework.doublyLinkedListLengthZero();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void testRemove1() {
        DoublyLinkedList<Integer> list = Framework.doublyLinkedListLengthOne();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
        assertEquals(0, list.remove(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void testRemove2() {
        DoublyLinkedList<Integer> list = Framework.doublyLinkedListLengthThree();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(4));
        assertEquals(0, list.remove(0));
        assertEquals(1, list.remove(0));
        assertEquals(2, list.remove(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void testSet() {
    }

    @Test
    void testGet() {
    }

    @Test
    void testThrowIndexOutOfBounds() {
    }

    static class Framework {
        static DoublyLinkedList<Integer> doublyLinkedListLengthZero() {
            return new DoublyLinkedList<>();
        }

        static DoublyLinkedList<Integer> doublyLinkedListLengthOne() {
            DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
            list.add(0, 0);
            return list;
        }

        static DoublyLinkedList<Integer> doublyLinkedListLengthTwo() {
            DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
            list.add(0, 0);
            list.add(1, 1);
            return list;
        }

        static DoublyLinkedList<Integer> doublyLinkedListLengthThree() {
            DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
            list.add(0, 0);
            list.add(1, 1);
            list.add(2, 2);
            return list;
        }

    }
}
