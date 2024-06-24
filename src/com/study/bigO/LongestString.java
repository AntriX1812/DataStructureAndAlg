package com.study.bigO;

//This Programm is created to parse and get the longest String from Array.
//Complexity : Time BigO(n) Space : Big O(1)
public class LongestString {

	public static String longestString(String arr[]) {
		String longestString = "";
		if (arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				String currntString = arr[i].trim();
				if (currntString.length() > longestString.length()) {
					longestString = currntString;
				}
			}
		} else {
			return "Array is Empty";
		}
		return longestString;
	}

	
	public static void main(String[] args) {
		String arr[] = {"Shanu","kokila","Yuvraj","Anaisha","Madhav","Antriksh"};
		System.out.println(longestString(arr));
	}
}

