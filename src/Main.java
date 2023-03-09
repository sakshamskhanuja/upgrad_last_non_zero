import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Stores n!
        int factorial = 1;

        // Calculates n!
        while (n >= 1) {
            factorial *= n;
            n--;
        }

        // Stores the last non-zero digit of factorial.
        int lastDigit = -1;

        // Finds the last non-zero digit of factorial.
        while (factorial != 0) {
            lastDigit = factorial % 10;
            if (lastDigit != 0) {
                return lastDigit;
            }
            factorial /= 10;
        }
        return lastDigit;
    }
}
