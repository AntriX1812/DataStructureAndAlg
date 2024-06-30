
/*******
 * 
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 * 
 * 
 * 
 * ******/

package com.study.bigO;

import java.util.TreeMap;

public class TopKFrequentElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {7,4,1,1,1,2,2,3,7,7,7,7,7};
		TopKFrequentElem obj = new TopKFrequentElem();
		obj.topKFrequent(nums, 2 );

	}
public int[] topKFrequent(int[] nums, int k) {
	
	TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
	for(int m=0;m<nums.length;m++) {
		if(!tm.containsKey(nums[m])) {
			tm.put(nums[m], 1);
		}else {
			    int val = tm.get(nums[m]);
				val++;
				tm.put(nums[m], val);
		}
	}
	if(tm.size()>0) {
		TreeMap<Integer,Integer> modMap = new TreeMap<Integer,Integer>();
		
		tm.forEach( (key, val) -> { 
			if(val != null && val>0) {
			    modMap.put(val, key);
			}
		} );
		
		System.out.println("mode"+modMap);	
	}
	
	System.out.println(tm);
	return new int[0];
        
    }
}
