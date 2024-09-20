public class Main {
    public static void main(String[] args) {
        int testNumber = 7;
        int testModulo = testNumber % 2;

        if (testModulo == 1) {
            System.out.println("\nBecause the remainder of the modulo" +
                    " function is " + testModulo + ", " + testNumber +
                    " is odd");
        }  else {
            System.out.println("\nBecause the remainder of the modulo" +
                    " function is " + testModulo + ", " + testNumber +
                    " is even");
        }
    }
}