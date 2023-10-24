package practice.code;

import java.util.Arrays;

public class BubleSort {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 3, 2 };
		System.out.println("arrays before sorting " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) { // n-1
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("arrays after sorting " + Arrays.toString(arr));
	}
}
