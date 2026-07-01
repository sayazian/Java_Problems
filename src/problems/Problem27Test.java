package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem27Test {

    @Test
    void testPostFixCalculator() {
        String input = "12+";
        assertEquals(3,Problem27.postFixCalculator(input));
    }

    @Test
    void testPostFixCalculator2(){
        String input = "34+7*9-4/";
        assertEquals(10, Problem27.postFixCalculator(input));

    }

    @Test
    void testDoTheMath() {
    }
}
