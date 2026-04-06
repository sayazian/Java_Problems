package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void findsInsertedValue() {
//        insert a value into the tree. The insert call should return true
//        call find for the same value. the call should return true.
        int value = 1;
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        assertTrue(tree.insert(value));
        assertTrue(tree.find(value));
    }

    @Test
    void insertDuplicate() {
//        First time return true, the second time return false
        int value = 1;
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        assertTrue(tree.insert(value));
        assertFalse(tree.insert(value));
    }

    @Test
    void delete() {
    }
}
