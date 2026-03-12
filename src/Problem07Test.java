import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem07Test {

    @Test
    void reverseList() {
        assertEquals(List.of("c", "b", "a"), Problem07.reverseList(List.of("a", "b", "c")));
        assertEquals(List.of(), Problem07.reverseList(List.of()));
        assertEquals(List.of(1), Problem07.reverseList(List.of(1)));
    }

    @Test
    void reverseListV2() {
        assertEquals(List.of(), Problem07.reverseListV2(List.of()));
        assertEquals(List.of(1), Problem07.reverseListV2(List.of(1)));
        assertEquals(List.of("c", "b", "a"), Problem07.reverseListV2(List.of("a", "b", "c")));
    }

    @Test
    void reverseListV3() {
        assertEquals(List.of(), Problem07.reverseListV3(List.of()));
        assertEquals(List.of(1), Problem07.reverseListV3(List.of(1)));
        assertEquals(List.of("c", "b", "a"), Problem07.reverseListV3(List.of("a", "b", "c")));
    }

    @Test
    void reverseListV30() {
        assertEquals(List.of(), Problem07.reverseListV30(List.of()));
        assertEquals(List.of(1), Problem07.reverseListV30(List.of(1)));
        assertEquals(List.of("c", "b", "a"), Problem07.reverseListV30(List.of("a", "b", "c")));
    }

    @Test
    void reverseInPlace() {
        List<String> list1  = new ArrayList<>(List.of());
        Problem07.reverseInPlace(list1);
        assertEquals(List.of(), list1);
        List<Integer> list2  = new ArrayList<>(List.of(1));
        Problem07.reverseInPlace(list2);
        assertEquals(List.of(1), list2);
        List<String> list3  = new ArrayList<>(List.of("a", "b", "c", "d"));
        Problem07.reverseInPlace(list3);
        assertEquals(new ArrayList<>(List.of("d", "c", "b", "a")), list3);
        List<String> list  = new ArrayList<>(List.of("a", "b", "c"));
        Problem07.reverseInPlace(list);
        assertEquals(new ArrayList<>(List.of("c", "b", "a")), list);
    }

}
