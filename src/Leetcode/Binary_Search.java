package Leetcode;

public class Binary_Search {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 45, 56, 67 };

//		System.out.println(searchElement(a, 67));

		int min = 0, max = a.length - 1;

		System.out.println(binarySearchRecursive(a, 4, min, max));

	}

//	public static int searchElement(int[] a, int v) {
//
//		int middleIndex = a.length / 2;
//		int min = 0, max = a.length - 1;
//
//		while (min <= max) {
//
//			if (v == a[middleIndex]) {
//				return middleIndex;
//			} else if (v < a[middleIndex]) {
//				max = middleIndex - 1;
//			} else {
//				min = middleIndex + 1;
//			}
//
//			middleIndex = (min + max) / 2;
//		}
//
//		return -1;
//
//	}

	public static int binarySearchRecursive(int[] a, int v, int min, int max) {

		int middleIndex = ((min + max) / 2);

		if (min <= max) {

			if (v == a[middleIndex]) {
				return middleIndex;
			} else if (v < a[middleIndex]) {
				return binarySearchRecursive(a, v, min, max - 1);
			} else {
				return binarySearchRecursive(a, v, min + 1, max);
			}
		}

		return -1;
	}
}
