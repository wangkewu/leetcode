package com.wkw.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode217 {

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		Integer[] array = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		List<Integer> list = Arrays.asList(array);
		set.addAll(list);
		if (list.size() != set.size()) {
			return true;
		}
		return false;
    }
	
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
		System.out.println(containsDuplicate(new int[] {1,2,3,4}));
		System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}
}
