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
}
