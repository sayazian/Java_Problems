package problems;

public class Problem11 {
    //    Produce the leap years between 1850 and 2050 Gregotrian Calendar
    public static void main() {
        for (int i = 1850; i <= 2050; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i);
            }
        }
    }
}
