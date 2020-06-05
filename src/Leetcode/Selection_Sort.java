package Leetcode;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 6, 2 };

		System.out.println(Arrays.toString(selectionSort(arr)));

	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i, temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		return arr;
	}

}
