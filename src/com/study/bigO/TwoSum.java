
/*
 * https://leetcode.com/problems/two-sum/description/
 * Input: nums = [2,7,11,15], target = 9
   Output: [0,1]
   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * */
package com.study.bigO;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1};//{2,7,11,15};
		TwoSum ts = new TwoSum();
		int [] arr =ts.twoSum(nums,11);
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		
		
		//2 
	}

	public int[] twoSum(int[] nums, int target) {

		Set set = new LinkedHashSet();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (set.contains(complement)) {
				System.out.println(set);
				int indx = getIndex(set,complement);
				int[] array = {indx,i};
				
				return array;

			} else {
				set.add(nums[i]);
			}
		}

		return new int[0];

	}

	public int getIndex(Set set, int element) {
		if (set != null && set.size() > 0) {
			ArrayList al = new ArrayList();
			al.addAll(set);
			for (int i = 0; i < al.size(); i++) {
				if ((int)al.get(i) == element) {
					System.out.println("Here");
					return i;
				}
			}

		} else {
			return -1;
		}
		return -1;
	}
}
