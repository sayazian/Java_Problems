package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MultiTree<T> {

    TreeNode<T> root;

    public List<String> preOrderTraversal() {
        return new ArrayList<>(root.preOrderTraversal());
    }

    public List<String> postOrderTraversal() {
        return new ArrayList<>(root.postOrderTraversal());
    }

    public List<String> preOrderTraversalStack() {
        List<String> output = new ArrayList<>();
        Stack<List<TreeNode<T>>> stack = new Stack<>();
        stack.push(new ArrayList<>(List.of(root)));
        while (!stack.isEmpty()) {
            if (stack.peek().isEmpty()) {
                stack.pop();
            } else {
                TreeNode<T> node = stack.peek().getFirst();
                output.add(node.visit());
                stack.peek().removeFirst();
                stack.push(new ArrayList<>(node.children));
            }
        }
        return output;
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
                for (TreeNode<U> treeNode : children) {
                    output.addAll(treeNode.preOrderTraversal());
                }
            }
            return output;
        }


        public class TreeNodeVisit<T> {
            TreeNode<T> treeNode;
            boolean childrenPushed;

            public TreeNodeVisit(TreeNode treeNode, boolean childrenPushed) {
                this.treeNode = treeNode;
                this.childrenPushed = childrenPushed;
            }
        }

        public List<String> postOrderTraversal() {
            List<String> output = new ArrayList<>();
            if (children != null) {
                for (TreeNode<U> treeNode : children) {
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
