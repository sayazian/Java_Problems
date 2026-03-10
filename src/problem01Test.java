import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_01Test {

    @Test
    void testFindLastSpace() {
        String s = "sahar ay";
        assertEquals(5,Problem_01.lastSpace(s));

        s = "";
        assertEquals(-1, Problem_01.lastSpace(s));

        s = " ";
        assertEquals(0, Problem_01.lastSpace(s));
    }

}
