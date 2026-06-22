package problems.problem26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleSentinalLinkedListTest {

    @Test
    void testLength0() {
        SList<Integer> listOfLengthZero = Framework.buildListOfLengthZero();
        assertEquals(0, listOfLengthZero.length());
    }

    @Test
    void testLength1() {
        SList<Integer> listOfLengthOne = Framework.buildListOfLengthOne();
        assertEquals(1, listOfLengthOne.length());
    }

    @Test
    void testLength3() {
        SList<Integer> listOfLengthThree = Framework.buildListOfLengthThree();
        assertEquals(3, listOfLengthThree.length());
        assertEquals(3, listOfLengthThree.length());
    }

    @Test
    void testGet0() {
        SList<Integer> listOfLengthZero = Framework.buildListOfLengthZero();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthZero.get(-1);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthZero.get(0);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthZero.get(1);
        });
    }

    @Test
    void testGet1() {
        SList<Integer> listOfLengthOne = Framework.buildListOfLengthOne();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthOne.get(-1);
        });
        assertEquals(10, listOfLengthOne.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthOne.get(100);
        });
    }

    @Test
    void testGet3() {
        SList<Integer> listOfLengthThree = Framework.buildListOfLengthThree();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthThree.get(-1);
        });
        assertEquals(10, listOfLengthThree.get(0));
        assertEquals(11, listOfLengthThree.get(1));
        assertEquals(12, listOfLengthThree.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthThree.get(3);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthThree.get(100);
        });
    }

    @Test
    void testSet0() {
        SList<Integer> listOfLengthZero = Framework.buildListOfLengthZero();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthZero.set(-1, 66);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthZero.set(0, 66);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthZero.set(1, 66);
        });
    }

    @Test
    void testSet1() {
        SList<Integer> listOfLengthOne = Framework.buildListOfLengthOne();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthOne.set(-1, 66);
        });
        listOfLengthOne.set(0, 66);
        assertEquals(66, listOfLengthOne.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthOne.set(100, 66);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthOne.set(1, 66);
        });
    }

    @Test
    void testSet3() {
        SList<Integer> listOfLengthThree = Framework.buildListOfLengthThree();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthThree.set(-1, 66);
        });
        listOfLengthThree.set(0, 66);
        assertEquals(66, listOfLengthThree.get(0));
        listOfLengthThree.set(1, 77);
        assertEquals(77, listOfLengthThree.get(1));
        listOfLengthThree.set(2, 88);
        assertEquals(88, listOfLengthThree.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthThree.set(3, 66);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            listOfLengthThree.set(100, 66);
        });
    }

    @Test
    void testAdd0() {
        SList<Integer> testList = Framework.buildListOfLengthZero();
        testList.add(0, 11);
        testList.add(0, 22);
        testList.add(0, 33);
        assertEquals(33, testList.get(0));
        assertEquals(22, testList.get(1));
        assertEquals(11, testList.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            testList.get(3);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            testList.add(-1, -33);
        });
    }

    @Test
    void testAdd1IOOBE() {
        SList<Integer> testList = Framework.buildListOfLengthZero();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            testList.add(1, 1);
        });
    }

    @Test
    void testAdd11() {
        SList<Integer> testList = Framework.buildListOfLengthOne();
        testList.add(1, 1);
        assertEquals(1, testList.get(1));
        testList.add(1, 11);
        assertEquals(11, testList.get(1));
        testList.add(1, 111);
        assertEquals(111, testList.get(1));
        assertEquals(10, testList.get(0));
        assertEquals(111, testList.get(1));
        assertEquals(11, testList.get(2));
        assertEquals(1, testList.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            testList.get(4);
        });
        assertEquals(4, testList.length());
    }

    @Test
    void testAdd30() {
        SList<Integer> testList = Framework.buildListOfLengthThree();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            testList.add(4, 0);
        });
        testList.add(3, 0);
        assertEquals(0, testList.get(3));
        assertEquals(4, testList.length());
    }

    @Test
    void testRemove0() {
        SList<Integer> testList = Framework.buildListOfLengthZero();
        assertThrows(IndexOutOfBoundsException.class, () -> {testList.remove(0);});
        assertThrows(IndexOutOfBoundsException.class, () -> {testList.remove(1);});
    }

    @Test
    void testRemove1() {
        SList<Integer> testList = Framework.buildListOfLengthOne();
        assertEquals(10, testList.remove(0));
        assertThrows(IndexOutOfBoundsException.class, () -> {testList.remove(-1);});
        assertThrows(IndexOutOfBoundsException.class, () -> {testList.remove(0);});
        assertThrows(IndexOutOfBoundsException.class, () -> {testList.remove(1);});
    }

    @Test
    void testRemove2() {
        SList<Integer> testList = Framework.buildListOfLengthThree();
        assertEquals(10, testList.remove(0));
        assertEquals(2, testList.length());
        assertEquals(11, testList.get(0));
        assertEquals(12, testList.get(1));

        assertEquals(12, testList.remove(1));
        assertEquals(1, testList.length());
        assertEquals(11, testList.get(0));

        assertEquals(11, testList.remove(0));
        assertEquals(0, testList.length());
        assertThrows(IndexOutOfBoundsException.class, () -> {testList.get(0);});

        testList.add(0, 100);
        testList.add(1, 101);
        testList.add(2, 102);
        assertThrows(IndexOutOfBoundsException.class, () -> { testList.remove(3);});
        assertEquals(102,testList.remove(2));
        assertEquals(101,testList.remove(1));
        assertEquals(100,testList.remove(0));
    }

    static class Framework {
        static SList<Integer> buildListOfLengthZero() {
            return new SimpleSentinalLinkedList<>();
        }

        static SList<Integer> buildListOfLengthOne() {
            SimpleSentinalLinkedList<Integer> objectSimpleSentinalLinkedList = new SimpleSentinalLinkedList<>();
            objectSimpleSentinalLinkedList.head.next = new SimpleSentinalLinkedList.Node<>();
            objectSimpleSentinalLinkedList.head.next.value = 10;
            return objectSimpleSentinalLinkedList;
        }

        static SList<Integer> buildListOfLengthThree() {
            SimpleSentinalLinkedList<Integer> objectSimpleSentinalLinkedList = new SimpleSentinalLinkedList<>();
            objectSimpleSentinalLinkedList.head.next = new SimpleSentinalLinkedList.Node<>();
            objectSimpleSentinalLinkedList.head.next.value = 10;
            objectSimpleSentinalLinkedList.head.next.next = new SimpleSentinalLinkedList.Node<>();
            objectSimpleSentinalLinkedList.head.next.next.value = 11;
            objectSimpleSentinalLinkedList.head.next.next.next = new SimpleSentinalLinkedList.Node<>();
            objectSimpleSentinalLinkedList.head.next.next.next.value = 12;
            return objectSimpleSentinalLinkedList;
        }
    }
}
