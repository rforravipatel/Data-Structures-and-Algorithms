package Leetcode;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

	private static boolean isPalindrome(int i) {
		if (i < 9)
			return false;
		int temp = 0, value = i;
		while (i != 0) {
			temp = (temp * 10) + (i % 10);
			i = i / 10;
		}
		if (value == temp) {
			return true;
		}
		return false;
	}

}
