package practice.interviewquestion;

import java.util.Arrays;

/**
 * @author Vikrant on 14-02-2024
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class MoveArrayElement {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 0, 1, 5, 0, 3 };

        System.out.println(Arrays.toString(moveElementToEnd(arr, 0)));
        System.out.println(Arrays.toString(moveElementToEndd(arr, 0)));
        System.out.println(Arrays.toString(moveElementToFront(arr, 0)));

    }

    private static int[] moveElementToEnd(int[] arr, int targetElement) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != targetElement) {
                // Move the non-zero element to the front of the array
                // and increment the element index
                arr[index++] = arr[i];
            }
        }
        // Fill the remaining positions with target element to End
        while (index < arr.length) {
            arr[index++] = targetElement;
        }
        return arr;
    }

    private static int[] moveElementToEndd(int[] arr, int targetElement) {
        int index = 0;
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is not equal to the target element
            if (arr[i] != targetElement) {
                // Swap the non-target element with the element at the current index
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                // Increment the element index
                index++;
            }
        }
        return arr;
    }

    private static int[] moveElementToFront(int[] arr, int targetElement) {
        int index = 0;
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is equal to the target element
            if (arr[i] == targetElement) {
                // Swap the target element with the element at the current index
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                // Increment the element index
                index++;
            }
        }
        return arr;
    }

}