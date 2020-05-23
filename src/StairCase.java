import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of staircase:");

		int stairs = scanner.nextInt();
		System.out.println("How many differnet number of stairs you want to take each time?");

		Integer stairsEachTime[] = new Integer[scanner.nextInt()];
		System.out.println("Enter different stairs numbers:");

		for (int i = 0; i < stairsEachTime.length; i++) {
			stairsEachTime[i] = scanner.nextInt();
		}

		List<Integer> stairsDifferent = Arrays.asList(stairsEachTime);
//		System.out.println(stairsDifferent);
		System.out.println(differentWaysGoUpStairs(stairs, stairsDifferent));
	}

	private static int differentWaysGoUpStairs(int stairs, List<Integer> stairsDifferent) {

		if (stairs == 0)
			return 1;

		int nums[] = new int[stairs + 1];
		nums[0] = 1;

		for (int i = 1; i <= stairs; i++) {
			int total = 0;
			for (Integer j : stairsDifferent) {
				if (i - j >= 0) {
					total += nums[i - j];
				}
			}
			nums[i] = total;
		}
		return nums[stairs];
	}
}
