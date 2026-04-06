package problems;

public class Problem09 {
    //    Print the multiplication table. You are not allowed to precompute the numbers. You have to have a loop in a loop.
    static void main() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (i * j == 100) {
                    System.out.print(" 100");
                } else {
                    System.out.print((i * j < 10 ? "   " : "  ") + (i * j));
                }
            }
            System.out.println();
        }
    }
}
