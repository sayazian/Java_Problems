package domain;

import java.util.ArrayList;
import java.util.List;

public class MultiTree<T> {

    TreeNode<T> root;

    public List<String> preOrderTraversal() {
        return new ArrayList<>(root.preOrderTraversal());
    }

    public List<String> postOrderTraversal() {
        return new ArrayList<>(root.postOrderTraversal());
    }

    public List<String> preOrderTraversalStack() {

        return new ArrayList<>(root.preOrderTraversal());
    }

    static class TreeNode<U> {
        U value;
        String name;
        List<TreeNode<U>> children;

        public TreeNode(U value, String name, List<TreeNode<U>> children) {
            this.value = value;
            this.name = name;
            this.children = children;
        }

        public String visit() {
            return name + ": " + value;
        }

        public List<String> preOrderTraversal() {
            List<String> output = new ArrayList<>();
            output.add(this.visit());
            if (children != null) {
                for (TreeNode<U> treeNode: children) {
                    output.addAll(treeNode.preOrderTraversal());
                }
            }
            return output;
        }

        public List<String> postOrderTraversal() {
            List<String> output = new ArrayList<>();
            if (children != null) {
                for (TreeNode<U> treeNode: children) {
                    output.addAll(treeNode.postOrderTraversal());
                }
            }
            output.add(this.visit());
            return output;
        }

        public U getValue() {
            return value;
        }

        public void setValue(U value) {
            this.value = value;
        }
    }
}
