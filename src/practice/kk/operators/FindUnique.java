package practice.kk.operators;

/**
 * @author Vikrant on 21-12-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 4, 6};
        System.out.println(isUnique(arr));
    }

    private static int isUnique(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
