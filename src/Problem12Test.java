import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Problem12Test {

    @Test
    void contains() {
        assertTrue(Problem12.contains(List.of(1, 2, 3), 1));
        assertFalse(Problem12.contains(List.of(1, 2, 3), 0));
        assertTrue(Problem12.contains(List.of(1), 1));
        assertFalse(Problem12.contains(List.of(1), 0));
        assertFalse(Problem12.contains(List.of(), 1));
        assertFalse(Problem12.contains(List.of(), null));
        assertTrue(Problem12.contains(List.of("a"), "a"));
        assertFalse(Problem12.contains(List.of("a"), "as"));
        assertTrue(Problem12.contains(List.of("abcd"), "ab" + "cd"));

        assertTrue(Problem12.contains(Set.of(1, 2, 3), 1));
        assertFalse(Problem12.contains(Set.of(1, 2, 3), 0));
        assertTrue(Problem12.contains(Set.of(1), 1));
        assertFalse(Problem12.contains(Set.of(1), 0));
        assertFalse(Problem12.contains(Set.of(), 1));
        assertFalse(Problem12.contains(Set.of(), null));
        assertTrue(Problem12.contains(Set.of("a"), "a"));
        assertFalse(Problem12.contains(Set.of("a"), "as"));
        assertTrue(Problem12.contains(Set.of("abcd"), "ab" + "cd"));

    }
}
