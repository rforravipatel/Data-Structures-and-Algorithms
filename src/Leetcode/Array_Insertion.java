package Leetcode;

import java.util.Arrays;

//Insertion in Ordered Array
public class Array_Insertion {

	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 45, 56, 67 };

//		System.out.println(Arrays.toString(arrayInsertion(a, 0)));

		System.out.println(Arrays.toString(arrayDeletion(a, 67)));
	}

	public static int[] arrayInsertion(int[] a, int v) {

		int[] ans = new int[a.length + 1];
		boolean inserted = true;
		for (int i = a.length - 1; i >= 0; i--) {

			if (a[i] > v) {
				ans[i + 1] = a[i];
			} else if ((a[i] == v || a[i] < v) && inserted) {
				ans[i + 1] = v;
				ans[i] = a[i];
				inserted = false;
			} else if (inserted == false) {
				ans[i] = a[i];
			}
		}
		return ans;
	}

	public static int[] arrayDeletion(int[] a, int v) {

		int len = a.length - 1;
		int[] ans = new int[len];
		boolean deleted = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == v || deleted) {
				ans[i] = a[i + 1];
				deleted = true;
			} else {
				ans[i] = a[i];
			}
		}

		return ans;
	}
}
