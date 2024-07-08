/**
   Given an integer array nums of length n, you want to create an array ans of length 2n 
   where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
   Specifically, ans is the concatenation of two nums arrays.
   Return the array ans.
 * **/

package com.study.array;

public class ConcatArray {

	
	public static void main(String[] args) {
		
		
		int [] array = {1,2,1};
		int [] concatArray = new int [2*array.length];
		//loop through main array
		for(int i=0;i<array.length;i++) {
			concatArray[i]=array[i];
			concatArray[i+array.length]=array[i];
			
		}
		for(int k=0;k<concatArray.length;k++) {
			System.out.println(concatArray[k]);
		}
		
	}
}
