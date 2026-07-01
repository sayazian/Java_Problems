package problems;


import java.security.InvalidParameterException;
import java.util.Stack;

//Given a string containing only single digit numbers and the four operations, implement a postfix calculator.
// You may assume the string is well-formed.
//For this, use a stack only. Stack of integer.
//Algorithm:
//1. Look at next char
//2. if number, push
//3. if operator, pop last two numbers, do operation, push result
//4. at the end of string, return the top of stack
public class Problem27 {
    public static int postFixCalculator(String input) {
        Stack<Integer> stack = new Stack<>();
        String mathFunctions = "+-/*";
        char[] chars = input.toCharArray();
        for (char c: chars) {
            if (c >= '0' && c <='9') {
                stack.push(c - '0');
            } else if (mathFunctions.indexOf(c) >= 0) {
                stack.push(doTheMath(c, stack.pop(), stack.pop()));
            } else {
                throw new InvalidParameterException();
            }
        }
        return stack.peek();
    }

    public static int doTheMath(char c, int input2, int input1) {
        switch (c) {
            case '+':
                return input1 + input2;
            case '-':
                return input1 - input2;
            case '*':
                return input1 * input2;
            case '/':
                return input1 / input2;
            default:
                return 0;
        }
    }
}
