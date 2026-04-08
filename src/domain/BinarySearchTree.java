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
//        if (find(value)) {
//            root = null;
//            return true;
//        }
//        return false;
        if (root == null) {
            return false;
        } else if (root.value.equals(value)) {
            root = null;
            return true;
        } else if (root.value.compareTo(value) > 0) {
            return checkDeleteLeft(root, value);
        } else if (root.value.compareTo(value) < 0) {
            return checkDeleteRight(root, value);
        }
        return true;
    }

    private boolean checkDeleteRight(TreeNode<T> node, T value) {
        if (node.right == null) {
            return false;
        } else if (node.right.value.equals(value)) {
            node.right = null;
            return true;
        } else if (node.right.value.compareTo(value) > 0) {
            return checkDeleteLeft(node.right, value);
        } else if (node.right.value.compareTo(value) < 0) {
            return checkDeleteRight(node.right, value);
        }
        return true;
    }

    private boolean checkDeleteLeft(TreeNode<T> node, T value) {
        if (node.left == null) {
        return false;
    } else if (node.left.value.equals(value)) {
        node.left = null;
        return true;
    } else if (node.left.value.compareTo(value) > 0) {
        return checkDeleteLeft(node.left, value);
    } else if (node.left.value.compareTo(value) < 0) {
        return checkDeleteRight(node.left, value);
    }
        return true;
    }

    private boolean deleteNode(TreeNode<T> node, T value) {
        if (find(value)) {
            node.setValue(null);
            return true;
        }
        return false;
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
