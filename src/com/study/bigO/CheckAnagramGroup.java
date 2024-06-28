/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/

package com.study.bigO;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class CheckAnagramGroup {

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> list = new ArrayList<List<String>>();
		LinkedHashMap<String, ArrayList<String>> hm = new LinkedHashMap<String, ArrayList<String>>();
		for (int i = 0; i < strs.length; i++) {
			String str = sort(strs[i]);
			if (!hm.containsKey(str)) {
				ArrayList<String> al = new ArrayList<String>();
				al.add(strs[i]);
				hm.put(str, al);
			} else {
				ArrayList<String> al = hm.get(str);
				al.add(strs[i]);
			}
		}

		if (hm.size() > 0) {
			hm.forEach((key, value) -> list.add(value));

		}
		// System.out.println(list);
		return list;

	}

	public static void main(String[] args) {
		CheckAnagramGroup obj = new CheckAnagramGroup();
		// obj.sort("zxdca");
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat", "", "a" };
		obj.groupAnagrams(strs);
	}

	public String sort(String str) {
		String sortString = "";
		if (str != null) {
			if (str.trim().equals("")) {
				return "";

			} else {
				char[] array = str.trim().toCharArray();// t e a
				char temp;
				for (int i = 0; i < array.length; i++) {
					for (int j = i + 1; j < array.length; j++) {
						if (array[i] > array[j]) {
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;

						}
					}
				}

				if (array.length > 0) {
					// System.out.println(array.length);
					StringBuilder sb = new StringBuilder();
					for (int k = 0; k < array.length; k++) {
						sb.append(array[k]);

					}
					sortString = sb.toString();
					System.out.println(sortString);
					return sortString;
				}
			}

		}

		return sortString;
	}
}
