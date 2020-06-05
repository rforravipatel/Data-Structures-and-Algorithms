package Leetcode;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 6, 2, 7, 1 };

		System.out.println(Arrays.toString(insertionSort(arr)));

	}

	public static int[] insertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}

		return arr;
	}

}
