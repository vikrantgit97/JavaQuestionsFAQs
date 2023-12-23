package practice.interviewquestion;

import java.util.Arrays;

/**
 * @author Vikrant on 22-12-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {45, 78, 65, 32, 5};
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
