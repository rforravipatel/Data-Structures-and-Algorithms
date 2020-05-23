package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {

	public static void main(String[] args) {

		int[] a = { 2, 7, 11, 5, 3, 8, 3, 2 };
		int[] is = twoSum(a, 5);
		System.out.println(Arrays.toString(is));
	}

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2)
			return new int[] { 0, 0 };

		HashMap<Integer, Integer> map = new HashMap<>();

		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			} else {
				map.put(nums[i], i);
			}
		}

		return new int[] { 0, 0 };
	}
}
