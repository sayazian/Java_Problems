//you have an int inputn, it returns the sum of all positive integers <= n, that are divisible by 3 or 5
public class Problem18 {
    public static int problem18(int n) {
        int sum = 0;
        int n3 = n / 3;
        int n5 = n / 5;
        int n15 = n / 15;
// divide before multiply, subtract before add to enlarge the range of the numbers this works for
        sum = (n3 * (n3 + 1) / 2) * 3 - (n15 * (n15 + 1) / 2) * 15 + (n5 * (n5 + 1) / 2) * 5  ;
        return sum;
    }
}
