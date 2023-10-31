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

        // 1st way Arrays.sort
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


        // 2nd way
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

        // 3rd way
        int highest = 0;
        int secondHighest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (highest < arr[i]) {
                secondHighest = highest;
                highest = arr[i];
            } else if (secondHighest < arr[i]) {
                secondHighest = arr[i];
            }
        }
        System.out.println("The second-highest element in the array is: " + secondHighest);


        // 4th Way bubble sort
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j] =temp;
            }
        }
        System.out.println("bubble sort The second-highest element in the array is: " + temp);
    }
}