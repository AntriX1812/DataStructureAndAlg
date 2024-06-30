package com.study.bigO;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 }; // [1,1,2,6] { 1, 2, 3, 4 } [24,12,8,6]
		ProductExceptSelf obj = new ProductExceptSelf();
		obj.productExceptSelf(nums);
	}

	public int[] productExceptSelf(int[] nums) {

		int left = 1;
		int right = 1;
		int[] tempArray = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			if (i == 0) {
				left = 1;

			} else {
				left = left * nums[i - 1];
			}
			tempArray[i] = left;
		}

		int n = tempArray.length;
		for (int k = n - 1; k >= 0; k--) {
			tempArray[k] *= right;
			right = right * nums[k];

		}
		for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}

		return tempArray;
	}
}
