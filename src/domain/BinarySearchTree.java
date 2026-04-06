package domain;

public class BinarySearchTree<T extends Comparable<T>> {
    TreeNode<T> root;

    public boolean insert(T value) {
        if (root == null) {
            root = new TreeNode<>();
            return true;
        } else {
            return false;
        }
    }

    public boolean find(T value) {
        return root != null;
    }

    public boolean delete(T value) {
        return true;
    }

    private static class TreeNode<U extends Comparable<U>> {
        U value;
        TreeNode<U> left;
        TreeNode<U> right;

        public U getValue() {
            return value;
        }

        public void setValue(U value) {
            this.value = value;
        }
    }
}
