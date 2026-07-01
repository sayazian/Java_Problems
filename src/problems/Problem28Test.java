package problems;

import java.util.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem28Test {

    @Test
    void testPostfixToInfix() {
        String input = "12+";
        assertEquals("(1+2)", Problem28.postfixToInfix(input));

    }

    @Test
    void testPostfixToInfix2() {
        String input = "34+7*9-4/";
        assertEquals("((((3+4)*7)-9)/4)", Problem28.postfixToInfix(input));

    }

    @Test
    void testPostfixToInfix3() {
        String input = "34+56+*";
        assertEquals("((3+4)*(5+6))", Problem28.postfixToInfix(input));

    }

    @Test
    void testMaxDepth() {
        String input = "34+56+*";
        Stack<Problem28.Node> stack = Problem28.getNodes(input);
        assertEquals(3, Problem28.maxDepth(stack.pop()));
    }

    @Test
    void testMaxDepth2() {
        String input = "34+7*9-4/";
        Stack<Problem28.Node> stack = Problem28.getNodes(input);
        assertEquals(5, Problem28.maxDepth(stack.pop()));
    }
}
