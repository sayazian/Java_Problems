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
    void insertFind() {
//        insert 8 4 12 2 6 10 14
//        assert on the presence of every number from 1-15
        BinarySearchTree<Integer> tree = createEvenNumberTree();
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

    private static BinarySearchTree<Integer> createEvenNumberTree() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        assertTrue(tree.insert(8));
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(12));
        assertTrue(tree.insert(2));
        assertTrue(tree.insert(6));
        assertTrue(tree.insert(10));
        assertTrue(tree.insert(14));
        return tree;
    }

    @Test
    void deletingFromEmptyTreeReturnsFalse() {
//        Create a tree. Delete something. It should return false.
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        assertFalse(tree.delete(0));
    }

    @Test
    void deletingExistingReturnsTrueNonexistingReturnsFalse() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(5);
        assertTrue(tree.delete(5));
        assertFalse(tree.delete(5));
    }

    @Test
    void deletingExistingReturnsTrueNonexistingReturnsFalseV2() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(5);
        assertFalse(tree.delete(1));
        assertTrue(tree.find(5));
        assertTrue(tree.delete(5));
        assertFalse(tree.find(5));
    }

    @Test
    void deletingExistingReturnsTrueNonexistingReturnsFalseV3() {
        BinarySearchTree<Integer> tree = createEvenNumberTree();
        tree.delete(10);
        assertTrue(tree.find(8));
        assertTrue(tree.find(4));
        assertTrue(tree.find(12));
        assertTrue(tree.find(2));
        assertTrue(tree.find(6));
        assertFalse(tree.find(10));
        assertTrue(tree.find(14));
    }

    void deletingExistingReturnsTrueNonexistingReturnsFalseV4() {
        BinarySearchTree<Integer> tree = createEvenNumberTree();
        tree.delete(14);
        assertTrue(tree.find(8));
        assertTrue(tree.find(4));
        assertTrue(tree.find(12));
        assertTrue(tree.find(2));
        assertTrue(tree.find(6));
        assertTrue(tree.find(10));
        assertFalse(tree.find(14));
    }
}
