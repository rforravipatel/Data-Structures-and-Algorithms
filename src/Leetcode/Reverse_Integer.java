package Leetcode;

public class Reverse_Integer {

	public static void main(String[] args) {
		System.out.println(reverse(1534236));
	}

	private static int reverse(int i) {
		int sign = i < 0 ? -1 : 1;
		i = Math.abs(i);
		int a = 0;

		while (i != 0) {
			a = (a * 10) + (i % 10);
			i = i / 10;
			if (a > Integer.MAX_VALUE || a < Integer.MIN_VALUE)
				return 0;
		}

		return sign * a;
	}

}
