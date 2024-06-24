//@author: Antriksh
//Version :01
// Difficulty Level: Very Easy
//@Doc:: In this code we are finding the time complexity of an array.
//Since the time complexity is depending on no of operations .
//so here time complexity is Big O(n) 
package com.study.bigO;

public class Class1 {

	 public static void main(String[] args) {
		int array[]= {3,4,5,6,7};
		printArray(array);
		/*
		 * Number of operation will increase as the size of the array will increase
		 * 
		 * */
		
	}
	
	 public static void printArray(int [] array) {
		 for(int i=0;i<array.length;i++) {
			 System.out.println(array[i]);
		 }
	 }
}
