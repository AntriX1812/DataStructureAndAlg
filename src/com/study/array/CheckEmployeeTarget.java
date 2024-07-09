/***
There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.
The company requires each employee to work for at least target hours.
You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
Return the integer denoting the number of employees who worked at least target hours.
Example 1:
Input: hours = [0,1,2,3,4], target = 2
Output: 3
 ***/
package com.study.array;

public class CheckEmployeeTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours[]= {0,1,2,3,4};
		int target=2;
		numberOfEmployeesWhoMetTarget(hours,target);

	}
	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
	int count=0;
		for(int k=0;k<hours.length;k++) {
			int difference=hours[k]-target;
			if(difference==0 || difference>0) {
				count++;
			}
		}
	        System.out.println(count);
	 return count;       
	 }

}
