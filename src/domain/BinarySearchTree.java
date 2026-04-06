package domain;

public class BinarySearchTree<T extends Comparable<T>> {
    TreeNode<T> root;

    public boolean insert(T value) {
        if (root == null) {
            root = new TreeNode<>(value);
            return true;
        } else {
            return false;
        }
    }

    public boolean find(T value) {
        if (root == null) {
            return false;
        } else return root.value.equals(value);
    }

    public boolean delete(T value) {
        return true;
    }

    private static class TreeNode<U extends Comparable<U>> {
        U value;
        TreeNode<U> left;
        TreeNode<U> right;

        public TreeNode(U value) {
            this.value = value;
        }

        public U getValue() {
            return value;
        }

        public void setValue(U value) {
            this.value = value;
        }
    }
}
