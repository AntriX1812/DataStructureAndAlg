package com.study.binarySearch;

public class CheckSumPair {

	
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8};
		
		int sum =7;
		int count =0;
		int left =0;
		int right=array.length-1;
		
		while(left<right)
		{
			
			if(array[left]+array[right]<sum) {
				count+=(right-left);
				left++;
			}else {
				right--;
			}
			
			
		}		
		System.out.println(count);
	}

	
	
}
