package com.study.binarySearch;

import java.util.Arrays;

public class SimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int num=1;
		int val = binarySearch(array,num);
		System.out.println(val);

	}

	public static int binarySearch(int[] array, int num) {

		if (array != null && array.length > 0) {
			//Arrays.sort(array);

			int left = 0;
			int right = array.length - 1;
			while (left <= right) {
            
				 int mid = (left+right)/2;
				 
				 if(array[mid]==num) {
					
					 return mid;
					 
				 }
				 
				 else if(num > array[mid]) {
					 left=mid+1;
				 }
				 else  {
					 right=mid-1;
				 }
		
			}

		}
		return -1;
	}

}
