import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem01Test {

    @Test
    void testFindLastSpace() {
        String s = "Sahar ay";
        assertEquals(5, Problem01.lastSpace(s));

        s = "";
        assertEquals(-1, Problem01.lastSpace(s));

        s = " ";
        assertEquals(0, Problem01.lastSpace(s));

        s = "Sahar ";
        assertEquals(5, Problem01.lastSpace(s));
    }

@Test
    void testFindLastSpaceLibrary() {
        String s = "Sahar ay";
        assertEquals(5, Problem01.lastSpaceLibrary(s));

        s = "";
        assertEquals(-1, Problem01.lastSpaceLibrary(s));

        s = " ";
        assertEquals(0, Problem01.lastSpaceLibrary(s));

        s = "Sahar ";
        assertEquals(5, Problem01.lastSpaceLibrary(s));
    }

}
