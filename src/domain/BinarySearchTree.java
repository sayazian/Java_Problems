package domain;

public class BinarySearchTree<T extends Comparable<T>> {
    TreeNode<T> root;

    public boolean insert(T value) {
        if (root == null) {
            root = new TreeNode<>(value);
        } else if (root.value.compareTo(value) > 0) {
            return insertLeft(root, value);
        } else if (root.value.compareTo(value) < 0) {
            return insertRight(root, value);
        } else {
            return false;
        }
        return true;
    }

    private boolean insertLeft(TreeNode<T> node, T value) {
        if (node.left == null) {
            node.left = new TreeNode<>(value);
        } else if (node.left.value.compareTo(value) > 0) {
            return insertLeft(node.left, value);
        } else if (node.left.value.compareTo(value) < 0) {
            return insertRight(node.left, value);
        } else {
            return false;
        }
        return true;
    }

    private boolean insertRight(TreeNode<T> node, T value) {
        if (node.right == null) {
            node.right = new TreeNode<>(value);
        } else if (node.right.value.compareTo(value) > 0) {
            return insertLeft(node.right, value);
        } else if (node.right.value.compareTo(value) < 0) {
            return insertRight(node.right, value);
        } else {
            return false;
        }
        return true;
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
