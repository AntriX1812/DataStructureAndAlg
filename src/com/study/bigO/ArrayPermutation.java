/***
 * LeetCode Problem : 
 * https://leetcode.com/problems/build-array-from-permutation/description/
 * 
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
   A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 * 
 * 
 * 
 * */

package com.study.bigO;

public class ArrayPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inp[]= {5,0,1,2,3,4};
		ArrayPermutation obj = new ArrayPermutation();
		int [] out = obj.buildArray(inp);
		for(int i : out) {
			System.out.println(i);
		}
	}
	
  public int[] buildArray(int[] nums) {
      int array[]= new int[nums.length];
	  try {
		  //Input: nums = [5,0,1,2,3,4]
		 // Output: [4,5,0,1,2,3]
		  
		  for(int i=0;i<nums.length;i++) {
			  array[i] = nums[nums[i]];
		  }
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	  return array;
    }
  
}
