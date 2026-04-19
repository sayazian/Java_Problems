package problems;

import java.util.Stack;

//Fibonacci with Stack
public class Problem21 {
    public static int fibonacci(int n) {
        Stack<FibonacciElement> stack = new Stack<>();
        stack.push(new FibonacciElement(1, 1, 0));
        if (n == 0) {
            return 0;
        } else {
            while (stack.peek().index < n) {
                FibonacciElement temp = stack.peek();
                stack.push(new FibonacciElement(temp.index + 1, temp.number + temp.lastNumber, temp.number));
            }

        }
        return stack.peek().number;
    }

    public static int fibonacciStacky(int origN) {
        Stack<FibCall> stack = new Stack<>();
        int returnValue = 0;
        stack.push(new FibCall(origN, -1, -1));
        while (true) {
            if (stack.peek().n == 0) {
                setRetVal(stack, 0, 0);
            } else if (stack.peek().n == 1) {
                setRetVal(stack, 1, 1);
            } else if (stack.peek().x == -1) {
                stack.push(new FibCall(stack.peek().n - 1, -1, -1));
            } else if (stack.peek().y == -1) {
                stack.push(new FibCall(stack.peek().n - 2, -1, -1));
            } else {
                FibCall popped = stack.pop();
                int sum = popped.x + popped.y;
                if (stack.isEmpty()) {
                    return sum;
                }
                setRetVal(stack, sum, popped.n);
            }
        }
    }

    private static void setRetVal(Stack<FibCall> stack, int answer, int n) {
        if (stack.peek().n - 1 == n) {
            stack.peek().x = answer;
        } else { // stack.peek().n - 2 == n
            stack.peek().y = answer;
        }
    }

    public static class FibonacciElement {
        int index;
        int number;
        int lastNumber;

        public FibonacciElement(int index, int number, int lastNumber) {
            this.index = index;
            this.number = number;
            this.lastNumber = lastNumber;
        }
    }

    public static class FibCall {
        int n;
        int x;
        int y;

        public FibCall(int n, int x, int y) {
            this.n = n;
            this.x = x;
            this.y = y;
        }
    }
}
