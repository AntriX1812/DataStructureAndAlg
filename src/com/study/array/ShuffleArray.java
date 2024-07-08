/**
 * 
 */
package com.study.array;

/**
 * Given the array nums consisting of 2n elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form
 * [x1,y1,x2,y2,...,xn,yn]. Example 1: Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7] Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7
 * then the answer is [2,3,5,4,1,7].
 * 
 */
public class ShuffleArray {
	public static int[] shuffle(int[] nums, int n) {

		if (nums != null && nums.length > 0 && n > 0) {

			int[] newArray = new int[nums.length];
			for (int i = 0; i < 3; i++) {
				newArray[2*i]=nums[i];
				newArray[2*i+1]=nums[i+n];
			}
			return newArray;
		}
		return new int[0];
	}

	public static void main(String[] args) {
		int[] retrnA = shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3);
		for (int i = 0; i < retrnA.length; i++) {
			System.out.println(retrnA[i]);
		}
	}
}
