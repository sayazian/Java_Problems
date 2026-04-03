import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem14Test {

    @Test
    void longestCommonPrefix() {
        assertEquals("sa", Problem14.longestCommonPrefix("sahar", "sara"));
        assertEquals("", Problem14.longestCommonPrefix("sahar", "nickan"));
        assertEquals("sahar", Problem14.longestCommonPrefix("sahar", "sahar"));
        assertEquals("", Problem14.longestCommonPrefix("", "sahar"));
        assertEquals("", Problem14.longestCommonPrefix("", ""));
        assertEquals("abc", Problem14.longestCommonPrefix("abc", "abcdef"));
        assertEquals("abc", Problem14.longestCommonPrefix("abcdef", "abc"));
    }

    @Test
    void longestCommonPrefixTest() {
        assertEquals("sa", Problem14.longestCommonPrefix(new String[] { "sahar", "sara", "samar" }));
        assertEquals("", Problem14.longestCommonPrefix(new String[] { "sahar", "sara", "samar", "nickan" }));
        assertEquals("sahar", Problem14.longestCommonPrefix(new String[] { "sahar" }));
        assertEquals("", Problem14.longestCommonPrefix(new String[] { }));
    }
}
