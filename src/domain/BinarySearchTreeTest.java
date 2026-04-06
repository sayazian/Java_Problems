package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void findsInsertedValue() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        assertTrue(tree.insert(0));
        assertTrue(tree.find(0));
    }

    @Test
    void insertDuplicate() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        assertTrue(tree.insert(0));
        assertFalse(tree.insert(0));
    }

    @Test
    void cannotFindWithNoInserts() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        assertFalse(tree.find(0));
    }

    @Test
    void insertAndFindValue() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        assertTrue(tree.insert(0));
        assertTrue(tree.find(0));
        assertFalse(tree.find(1));
    }

    @Test
    void insertTwoItems() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        assertTrue(tree.insert(0));
        assertTrue(tree.insert(1));
        assertTrue(tree.find(0));
        assertTrue(tree.find(1));
        assertFalse(tree.find(2));
    }

    @Test
    void name() {
//        insert 8 4 12 2 6 10 14
//        assert on the presence of every number from 1-15
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        assertTrue(tree.insert(8));
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(12));
        assertTrue(tree.insert(2));
        assertTrue(tree.insert(6));
        assertTrue(tree.insert(10));
        assertTrue(tree.insert(14));

        assertTrue(tree.find(8));
        assertTrue(tree.find(4));
        assertTrue(tree.find(12));
        assertTrue(tree.find(2));
        assertTrue(tree.find(6));
        assertTrue(tree.find(10));
        assertTrue(tree.find(14));

        assertFalse(tree.find(1));
        assertFalse(tree.find(3));
        assertFalse(tree.find(5));
        assertFalse(tree.find(7));
        assertFalse(tree.find(9));
        assertFalse(tree.find(11));
        assertFalse(tree.find(13));
        assertFalse(tree.find(15));

    }
}
