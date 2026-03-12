
//Find the longest string in an array of Strings
public class Problem02 {
    public static String findLastLongestString(String[] strings) {
        int maxIndex = indexOfLastLongestString(strings);
        return maxIndex != -1 ? strings[maxIndex] : null;
    }

    public static String findFirstLongestString(String[] strings) {
        int maxIndex = indexOfFirstLongestString(strings);
        return maxIndex != -1 ? strings[maxIndex] : null;
    }

    public static int indexOfFirstLongestString(String[] strings) {
        return firstOrLastLongestStringIndex(strings, true);
    }

    public static int indexOfLastLongestString(String[] strings) {
        return firstOrLastLongestStringIndex(strings, false);
    }

    private static int firstOrLastLongestStringIndex(String[] strings, boolean first) {
        int maxIndex = -1;
        for (int i = 0; i < strings.length; i++) {
            if (maxIndex == -1 || strings[i].length() > strings[maxIndex].length() ||
                    strings[i].length() == strings[maxIndex].length() && !first) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
