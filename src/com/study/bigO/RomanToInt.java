package com.study.bigO;

public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(romanToInt("XXIV"));
		//Time Complexity BigO(n) and space is Big O(1)

	}

	public static int romanToInt(String s) {
		int result = 0;
		if (s != null) {
			char array[] = s.toCharArray();
			if (array.length > 0) {
				if (array.length == 1) {
					return returnInt(array[0]);
				} else {

					for (int i = 0; i < array.length; i++) {
						int num1 = returnInt(array[i]);// 10,1
						if (i + 1 < array.length) {

							int num2 = returnInt(array[i + 1]);// 1,5
							if (num1 >= num2) {
								result = result + num1;
							} else {
								result = result - num1;
							}
						} else {
							result = result + num1;
						}
					}
				}
			}
		} else {
			return -1;
		}
		return result;
	}

	public static int returnInt(char c) {
		if (c != '\u0000') {
			if (c == 'I') {
				return 1;
			} else if (c == 'V') {
				return 5;
			} else if (c == 'X') {
				return 10;
			} else if (c == 'L') {
				return 50;
			} else if (c == 'C') {
				return 100;
			} else if (c == 'D') {
				return 500;
			} else if (c == 'M') {
				return 1000;
			}
		} else {
			return -1;
		}
		return -1;
	}
}
