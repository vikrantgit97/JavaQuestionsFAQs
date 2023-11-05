package practice.easy;

/**
 * @author Vikrant on 04-11-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class RangeOfPrimeNumber {
    public static void main(String[] args) {

        int start = 5, end = 10;
        for (int n = start; n <= end; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println(n);
        }


        // using for loop
        while(start <= end) {
            int count = 0;
            for(int i = 1; i <= start; i++) {
                if(start % i == 0) {
                    count++;
                }
            }
            if(count == 2)
                System.out.println(start);
            start++;
        }
    }
}
