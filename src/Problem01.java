//Find the last space in a String
public class Problem_01 {
    public static int lastSpace(String s) {
        for(int i = s.length() - 1; i >=0; i--) {
            if(s.charAt(i) == ' ') {
                return i;
            }
        }
        return -1;
    }
}
