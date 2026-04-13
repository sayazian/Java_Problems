package domain;

import java.util.ArrayList;
import java.util.List;

public class MultiTree<T> {

    TreeNode<T> root;

   public static List<String> preOrderTraversal() {
       return new ArrayList<>();
//       where root is a, and children are b c d, then traversal should return a list abcd
   }

   public static List<String> postOrderTraversal() {
       return new ArrayList<>();
//       where root is a, and children are b c d, then post-traversal should return a list bcda (a: node.visit)
   }

    private static class TreeNode<U> {
        U value;
        String name;
        List<U> children;

        public TreeNode(U value) {
            this.value = value;
        }

        public String visit() {
            return name + ": " + value;
        }

        public U getValue() {
            return value;
        }

        public void setValue(U value) {
            this.value = value;
        }
    }
}
