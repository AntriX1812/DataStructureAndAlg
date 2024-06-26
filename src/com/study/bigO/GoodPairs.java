package com.study.bigO;
//https://leetcode.com/problems/number-of-good-pairs/
/*Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
public class GoodPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodPairs gp = new GoodPairs();
		int nums []= {1,2,3,1,1,3};
		int result =gp.numIdenticalPairs(nums);
		System.out.println(result);
	}
public int numIdenticalPairs(int[] nums) {
	int result=0;
	try {
		int i,j=0;
		for(i=0;i<nums.length;i++) {
			for(j=i+1;j<nums.length;j++) {
				if(i<j) {
					if(nums[i] == nums[j]) {
						result++;
					}
				}
			}
		}
	}catch(Exception e) {e.printStackTrace();}
	return result;   
    }

}
