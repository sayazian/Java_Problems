public class Problem05 {
//Implement Fibonacci series, given n, return f(n)

    public static int fibonacciV1(int n) {
        int output = 0;
        if (n > 1) {
            output = fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 1) {
            output = 1;
        } else {
            output = 0;
        }
        return output;
    }

//  iterative version
    public static int fibonacciX(int n) {
        int output = 0;
        int previousIteration = 1;
        int prePreviousIteration = 0;
        if (n > 1) {
            for (int i = 1; i < n; i++) {
                output = previousIteration + prePreviousIteration;
                prePreviousIteration = previousIteration;
                previousIteration = output;
            }
        } else if (n == 1) {
            output = 1;
        } else {
            output = 0;
        }
        return output;
    }

    //  iterative version
    public static int fibonacci(int n) {
        int output = 0;
        int nextIteration = 1;
        for (int i = 0; i < n; i++) {
            int nextNext = output + nextIteration;
            output = nextIteration;
            nextIteration = nextNext;
        }
        return output;
    }
}
