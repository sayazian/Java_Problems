package problems;


import java.util.Stack;

//postfix-to-infix algorithm:
//1. Look at next char
//2. if number, push node containing number
//3. if operator, pop last two node, create node with operation and two nodes, push result
//4. at the end of string, pop the top of stack, do in-order traversal (use parentheses), return result
public class Problem28 {
    static class Node {
        char value;
        Node left;
        Node right;

        public Node(char c) {
            this.value = c;
        }
    }

    public static String postfixToInfix(String input) {
        Stack<Node> stack = getNodes(input);
        StringBuffer sb = new StringBuffer();
        treeToInfix(sb, stack.pop());
        return sb.toString();
    }

    static Stack<Node> getNodes(String input) {
        char[] chars = input.toCharArray();
        String mathFunctions = "+-*/";
        Stack<Node> stack = new Stack<>();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                stack.push(new Node(c));
            } else if (mathFunctions.indexOf(c) >= 0) {
                Node node = new Node(c);
                node.right = stack.pop();
                node.left = stack.pop();
                stack.push(node);
            }
        }
        return stack;
    }

    private static void treeToInfix(StringBuffer sb, Node node) {
        if (node.left != null) {
            sb.append("(");
            treeToInfix(sb, node.left);
            sb.append(node.value);
            treeToInfix(sb, node.right);
            sb.append(")");
        } else {
            sb.append(node.value);
        }
    }

    static int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
        }
    }
}
