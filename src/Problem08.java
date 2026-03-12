public class Problem08 {

    //    Print the numbers 1 to 100 except if it is divisible by 3 write fizz, if it is divisible 5 write bin and if it is
    //    divisible by both write fizz-bin
    public static void main(String[] args) {
        fizzbin();
    }
    public static void fizzbin() {
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.print("fizz-bin, ");
            } else if (i % 3 == 0) {
                System.out.print("fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("bin, ");
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.print("bin.");
    }
}
