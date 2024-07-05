package com.study.bigO;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [100,4,200,1,3,2] Output: 4 Explanation: The longest
 * consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * 
 */
public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		longestConsecutive(new int[] { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 });
		// longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 });
	}

	public static int longestConsecutive(int[] nums) {
		int currMaxSequence = 1;
		int currSequenceFinal = 1;
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length > 0) {
			// First Sort the element
			TreeSet<Integer> tset = new TreeSet<Integer>();
			for (int i = 0; i < nums.length; i++) {
				tset.add(nums[i]);
			}
			// System.out.println(tset);
			ArrayList<Integer> alist = new ArrayList<Integer>();
			alist.addAll(tset);

			for (int k = 0; k < alist.size(); k++) {
				if (alist.size() == 1) {
					return 1;
				}
				if (k + 1 < alist.size()) {
					if (alist.get(k) + 1 == alist.get(k + 1)) {
						currMaxSequence++;
						// System.out.println("here");
					}

					else {
						currSequenceFinal = Math.max(currMaxSequence, currSequenceFinal);
						currMaxSequence = 1;
					}
				}
			}
		}
		currSequenceFinal = Math.max(currMaxSequence, currSequenceFinal);
		// System.out.println(currSequenceFinal);
		return currSequenceFinal;
	}

}