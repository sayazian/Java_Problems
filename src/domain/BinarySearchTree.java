package domain;

public class BinarySearchTree<T extends Comparable<T>> {
    TreeNode<T> root;

    public boolean insert(T value) {
        if (root == null) {
            root = new TreeNode<>(value);
        } else {
            return position(root, value);
        }
        return true;
    }

    private boolean position(TreeNode<T> node, T value) {
        if (node.value.compareTo(value) > 0) {
            if (node.left == null) {
                node.left = new TreeNode<>(value);
            } else {
                return position(node.left, value);
            }
            return true;
        } else if (node.value.compareTo(value) < 0) {
            if (node.right == null) {
                node.right = new TreeNode<>(value);
            } else {
                return position(node.right, value);
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean checkNodeValue(TreeNode<T> node, T value) {
        if (node == null) {
            return false;
        } else if (node.value.compareTo(value) > 0) {
            return checkNodeValue(node.left, value);
        } else if (node.value.compareTo(value) < 0) {
            return checkNodeValue(node.right, value);
        } else {
            return true;
        }
    }

    public boolean find(T value) {
        return checkNodeValue(root, value);
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
