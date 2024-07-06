package com.study.twoPointer;

public class TwoPointerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// In two pointer algorithm the array will always be sorted.
		int [] array = {2,4,6,8,10};
		int target=18;
		int low=0;
		int high=array.length-1;
		
		while(low<high) {
			int sum = (array[low]+array[high]);
			if(sum== target) {
				
				System.out.println(low+" "+high);
				break;
			}
			if(sum<target) {
				low++;
			}
			else if(sum>target) {
				high--;
			}
		}
		
		
	}

}
