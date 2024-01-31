package practice.kk.MathForDsa2;

/**
 * @author Vikrant on 31-01-2024
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
