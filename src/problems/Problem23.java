package problems;

// Write a function that print out all numbers < 1000
// that is the sum of squares of two positive numbers and the squares

public class Problem23 {
    public static void main(String[] args) {
        for (int i = 1; i < 32; i++) {
            for (int j = 1; j < 32; j++) {
                int sum = i*i + j*j;
                if (sum < 1000) {
                    System.out.println(i + "\t" + j + "\t" + sum);
                } else {
                    break;
                }
            }
        }
    }
}
