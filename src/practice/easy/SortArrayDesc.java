package practice.easy;

import java.util.Arrays;

public class SortArrayDesc {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 0, 1, 5, 0, 9, 3 };
        System.out.println(Arrays.toString(sortElementDesc(arr)));
    }

    private static int[] sortElementDesc(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        return arr;
    }
}