package Leetcode;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 6, 2 };

		System.out.println(Arrays.toString(bubblesort(arr)));
	}

	private static int[] bubblesort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}
}
