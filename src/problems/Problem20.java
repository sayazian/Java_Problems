package problems;


import java.util.Stack;

//Factorial with a stack
public class Problem20 {
    public static int factorialStack(int n) {
        Stack<Integer> stack = new Stack<>();
        int output = 1;
        if (n == 0) {
            stack.push(1);
        } else {
            stack.push(n);
        }
        boolean pushedAll = false;
        while (!stack.isEmpty()) {
            if (!pushedAll) {
                if (stack.peek() == 1) {
                    pushedAll = true;
                } else {
                    stack.push(stack.peek() - 1);
                }
            } else {
                output *= stack.pop();
            }
        }
        return output;
    }

    public static int factorialStackFrame(int n) {
        Stack<StackFrame> stack = new Stack<>();
        stack.push(new StackFrame(n, 0));
        int programCounter = 1;
        while (true) {
            switch (programCounter) {
                case 0:
                    return stack.peek().returnValue;
                case 1:
                    if (stack.peek().n <= 1) {
                        stack.peek().returnValue = 1;
                        programCounter = stack.peek().returnAddress;
                    } else {
                        stack.push(new StackFrame(stack.peek().n - 1, 2));
                        programCounter = 1;
                    }
                    break;
                case 2:
                    int returnValue = stack.peek().returnValue;
                    stack.pop();
                    stack.peek().returnValue = stack.peek().n * returnValue;
                    programCounter = stack.peek().returnAddress;
                    break;
            }
        }
    }

    private static class StackFrame {
        int returnValue;
        int returnAddress;
        int n;

        public StackFrame(int n, int returnAddress) {
            this.n = n;
            this.returnAddress = returnAddress;
        }
    }
}
