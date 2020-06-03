package CodingCrackingInterview;

import java.util.Scanner;

// Big O is O(n)
public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find factorial:");
		int getFactorialOfNumber = scanner.nextInt();

		System.out.println(factorialValue(getFactorialOfNumber));

		scanner.close();
	}

	public static int factorialValue(int number) {
		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 1;
		} else {
			return number * factorialValue(number - 1); // 5*4*3*2*1
		}
	}

//	5 * factorial(4)
//	4 * factorial(3)
//	3 * factorial(2)
//	2 * factorial(1)
//	1 * factorial(0)
}
