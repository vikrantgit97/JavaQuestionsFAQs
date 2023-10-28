package practice.interviewquestion;

import java.util.Arrays;

/**
 * @author Vikrant on 28-10-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class ArraySecondHighestElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 56, 89, 5};

        if (arr.length < 2) {
            System.out.println("There is no second-highest element in the array.");
        } else {
            // Sort the array in descending order
            Arrays.sort(arr);
            int n = arr.length;

            // The second-highest element is at the (n-2) index in the sorted array
            int secondHighest = arr[n - 2];

            System.out.println("The second-highest element in the array is: " + secondHighest);
        }


        // Another way--------------------------------------------------------------------

        if (arr.length < 2) {
            System.out.println("There is no second-highest element in the array.");
        } else {
            int firstMax = arr[0];
            int secondMax = arr[0];

            for (int i = 1; i < arr.length; i++) {
                int num = arr[i];

                if (num > firstMax) {
                    secondMax = firstMax;
                    firstMax = num;
                } else if (num > secondMax && num != firstMax) {
                    secondMax = num;
                }
            }

            if (secondMax == firstMax) {
                System.out.println("There is no second-highest element in the array.");
            } else {
                System.out.println("The second-highest element in the array is: " + secondMax);
            }
        }
    }
}