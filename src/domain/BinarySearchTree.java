package domain;

public class BinarySearchTree<T extends Comparable<T>> {
    TreeNode<T> root;

    public boolean insert(T value) {
        if (root == null) {
            root = new TreeNode<>(value);
            return true;
        } else if (root.value.equals(value)) {
            return false;
        } else if (root.value.compareTo(value) > 0) {
            if (root.left == null) {
                root.left = new TreeNode<>(value);
                return true;
            } else {
                return false;
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode<>(value);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean find(T value) {
        if (root == null) {
            return false;
        } else if (root.value.equals(value)) {
            return true;
        } else if (root.value.compareTo(value) > 0) {
            if (root.left == null) {
                return false;
            } else {
                return root.left.value.equals(value);
            }
        } else {
            if (root.right == null) {
                return false;
            } else {
                return root.right.value.equals(value);
            }
        }
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
