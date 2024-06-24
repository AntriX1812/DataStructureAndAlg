/****
 * @author Antriksh
 * @version 1
 * @difficulty : Very Easy
 * 
 * This class is having multiple methods which are describing the Big O notation.
 * Since the time complexity is depends upon the no. of operations .
 * So we will find the complexity in the same way
 * */
package com.study.bigO;

public class Class1 {

	 public static void main(String[] args) {
		int array[]= {3,4,5,6,7};
		// Case :: 1
		System.out.println("linearAlgo :::: This Big O of this is O(n) because the number of operations increasing"
	    		+ " as the size of array will increase");
		linearAlgo(array);
		System.out.println("bigO1 :::: This Big O of this is O(1) because the number of operations not increasing"
	    		+ " as the size of array will increase");
		bigO1(array);
		System.out.println("square :::: This Big O of this is O(n*n) because the number of operations getting  square");
	    		
		square(array);
		bigO1(array);
		System.out.println("square :::: This Big O of this is log(n)");
		logN(16);
	}
	// Big O(n)
	public static void linearAlgo(int arr[]) {
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]);
	  }
	}
	// Big O(1)
	public static void bigO1(int arr[]) {
		System.out.println(arr[0]);
		
	}
	//Big O(n square)
	public static void square(int arr[]) {
		int totOp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
				totOp++;
			}
		}
		System.out.println("Length of Array : "+arr.length +"\nTotal Operations "+totOp);
	}
	
	// BigO(log n)
	    public static void logN(int n) {
	    	for(int i=1;i<n;i=i*2) {
	    		System.out.println(i);
	    	}
	    }
}

