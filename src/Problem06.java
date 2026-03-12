public class Problem06 {
//    Calculate factorial both iteratively and recursively

    public static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static int factorialIterative(int n) {
        int output = 1;
        for (int i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }
}
