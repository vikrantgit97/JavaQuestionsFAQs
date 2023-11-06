package practice.interviewquestion;

/**
 * @author Vikrant on 06-11-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }

        //print any fibonacci number at index 6 th
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
