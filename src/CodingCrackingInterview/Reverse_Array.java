package CodingCrackingInterview;

import java.util.Arrays;

//Big O is O(n)

public class Reverse_Array {

	public static void main(String[] args) {

		int[] arraytoReverse = { 1, 8, 4, 2, 4, 3 };

		for (int i = 0; i < arraytoReverse.length / 2; i++) {
			int firstElement = arraytoReverse[i];
			int lastElement = arraytoReverse[arraytoReverse.length - i - 1];
			arraytoReverse[i] = lastElement;
			arraytoReverse[arraytoReverse.length - i - 1] = firstElement;
		}

		System.out.println(Arrays.toString(arraytoReverse));
	}
}
