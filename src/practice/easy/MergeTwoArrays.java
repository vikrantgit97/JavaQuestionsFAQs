package practice.easy;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int arr[] = { 4, 2, 3, 1 };
        int arr2[] = { 9, 5, 7, 6, 8 };
        int arr3[] = new int[arr.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            // merging logic
            if (arr.length > i) {
                arr3[i] = arr[i];
            } else {
                arr3[i] = arr2[i - arr.length];
            }
            // sorting logic
            for (int j = 0; j < arr3.length; j++) {
                // works fine with asc order
                if (arr3[i] < arr3[j]) {
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr3));
    }
}
