public class Problem14 {
    //    Longest common prefix between two strings
    public static String longestCommonPrefix(String s1, String s2) {
        return s1.substring(0, longestCommonPrefixIndex(s1, s1.length(), s2));
    }

    public static int longestCommonPrefixIndex(String s1, int lcpIndex, String s2) {
        int minSize = Math.min(lcpIndex, s2.length());
        int index = minSize;
        for (int i = 0; i < minSize; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static String longestCommonPrefix(String[] strings) {
        if (strings.length > 0) {
            int lcpIndex = strings[0].length();
            for (int i = 1; i < strings.length; i++) {
                lcpIndex = longestCommonPrefixIndex(strings[0], lcpIndex, strings[i]);
            }
            return strings[0].substring(0, lcpIndex);
        }
        return "";
    }
}
