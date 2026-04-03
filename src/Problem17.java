// Print the first 10 lines of Pascal's triangle

public class Problem17 {
    public static void main(String[] args) {
        pascalTriangle(10);
    }

    public static void pascalTriangle(int n) {
        int[][] a = new int[n + 1][n + 1];
        a[1][1] = 1;
        System.out.print(a[1][1] + "\n");
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
