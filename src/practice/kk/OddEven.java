package practice.kk;

/**
 * @author Vikrant on 21-12-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class OddEven {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
