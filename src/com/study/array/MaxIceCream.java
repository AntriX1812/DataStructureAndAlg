/****** It is a sweltering summer day, and a boy wants to buy some ice cream bars.
At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 
Note: The boy can buy the ice cream bars in any order.
Return the maximum number of ice cream bars the boy can buy with coins coins.
You must solve the problem by counting sort.
Example 1:
Input: costs = [1,3,2,4,1], coins = 7
Output: 4*****/

package com.study.array;

import java.util.Arrays;

public class MaxIceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] costs = { 27, 23, 33, 26, 46, 86, 70, 85, 89, 82, 57, 66, 42, 18, 18, 5, 46, 56, 42, 82, 52, 78, 4, 27,
				96, 74, 74, 52, 2, 24, 78, 18, 42, 10, 12, 10, 80, 30, 60, 38, 32, 7, 98, 26, 18, 62, 50, 42, 15, 14,
				32, 86, 93, 98, 47, 46, 58, 42, 74, 69, 51, 53, 58, 40, 66, 46, 65, 2, 10, 82, 94, 26, 6, 78, 2, 101,
				97, 16, 12, 18, 71, 5, 46, 22, 58, 12, 18, 62, 61, 51, 2, 18, 34, 12, 36, 58, 20, 12, 17, 70 };
		int coins = 241;
		maxIceCream(costs, coins);

	}

	public static int maxIceCream(int[] costs, int coins) {
		int counter = 0;
		int sum = 0;
		try {
			if (costs != null && costs.length > 0 && coins > 0) {
				// First Sort the Array
				if (costs.length == 1 && costs[0] <= coins) {
					return 1;
				} else {
					// Sort array in ascending 2,1,2,3,4,1

					// int arrayNew[] = new int[costs.length];
					int temp = 0;
					/*
					 * for (int i = 0; i < costs.length; i++) { for (int j = i + 1; j <
					 * costs.length; j++) { if (costs[i] > costs[j]) { temp = costs[i]; costs[i] =
					 * costs[j]; costs[j] = temp;
					 * 
					 * } } }
					 */
                   Arrays.sort(costs);
					for (int i = 0; i < costs.length; i++) {

						if (sum + costs[i] <= coins) { // System.out.println("costs[i]"+costs[i]);
							sum = sum + costs[i];
							counter++;
						}

					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(counter);
		return counter;
	}
}
