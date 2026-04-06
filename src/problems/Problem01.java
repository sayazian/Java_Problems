package problems;

//Find the last space in a String
public class Problem01 {
    public static int lastSpace(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return i;
            }
        }
        return -1;
    }

//Use a library function
    public static int lastSpaceLibrary(String s) {
        return s.lastIndexOf(' ');
    }
}

