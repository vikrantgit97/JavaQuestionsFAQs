package practice.leetcode;

import java.util.Arrays;

/*Given an array of integers nums and an integer target, return indices of the two numbers such 
that they add up to target.You may assume that each input would have exactly one solution, 
and you may not use the same element twice.You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]*/

public class Leetcode_1 {
	
	public int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					//return new int [] {i,j};  	returning position at index
					return new int[] { numbers[i], numbers[j] }; //returning array at runtime
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Leetcode_1 test = new Leetcode_1();
		int arr[] = { 1, 2, 4, 8 };
		System.out.println(Arrays.toString(test.twoSum(arr, 9)));
	}
}
