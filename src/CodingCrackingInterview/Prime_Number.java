package CodingCrackingInterview;

import java.util.Scanner;

//Big O is O(sqrt(n))
public class Prime_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check if it is prime or not?:");
		int isNumberPrime = scanner.nextInt();

		System.out.println(isPrime(isNumberPrime));

		scanner.close();

	}

	public static boolean isPrime(int number) {
		for (int i = 2; i * i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
