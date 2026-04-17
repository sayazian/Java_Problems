package problems;

import java.util.Stack;

//Fibonacci with Stack
public class Problem21 {
    public static int fibonacci(int n) {
        Stack<FibonacciElement> stack = new Stack<>();
        stack.push(new FibonacciElement(0, 0));
        stack.push(new FibonacciElement(1, 1));
        if (n == 0) {
            return 0;
        } else {
            while (stack.peek().index < n) {
                FibonacciElement temp = stack.pop();
                FibonacciElement temp2 = stack.pop();
                stack.push(temp);
                stack.push(new FibonacciElement(temp.index + 1, temp.number + temp2.number));
            }

        }
        return stack.peek().number;
    }

    public static class FibonacciElement {
        int index;
        int number;

        public FibonacciElement(int index, int number) {
            this.index = index;
            this.number = number;
        }
    }
}
