import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy nem negatív egész számot: ");
        int n = scanner.nextInt();

        int sum = calculateDigitSum(n);
        System.out.println("A számjegyek összege: " + sum);
    }

    public static int calculateDigitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + calculateDigitSum(n / 10);
        }
    }
}