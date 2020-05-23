package Using_Java_8;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Arraylist_EvenOdd {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		// Print only Even numbers
		list.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});

		// Find sum of given elements
		Integer sum = list.stream().mapToInt(e -> e.intValue()).sum();
		System.out.println("The sum of list is:" + sum);

		// Find average of given elements
		OptionalDouble average = list.stream().mapToInt(e -> e.intValue()).average();
		System.out.println("The average of list is:" + average);

		// Find first element of given elements
		Optional<Integer> firstElement = list.stream().findFirst();
		System.out.println("The first Element of list is:" + firstElement);

		// Find minimum value of given elements
		OptionalInt minimum = list.stream().mapToInt(Integer::intValue).min();
		System.out.println("The first Element of list is:" + minimum);

		// Find maximum value of given elements
		OptionalInt maximum = list.stream().mapToInt(Integer::intValue).max();
		System.out.println("The first Element of list is:" + maximum);

	}

}
