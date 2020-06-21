package Leetcode;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {

		Tower_Of_Hanoi tower_Of_Hanoi = new Tower_Of_Hanoi();
		tower_Of_Hanoi.move(4, 'A', 'C', 'B');
	}

	public void move(int numberofDiscs, char from, char to, char inter) {

		if (numberofDiscs == 1) {
			System.out.println("Moving disc " + numberofDiscs + " from " + from + " to " + to);
		} else {
			move(numberofDiscs - 1, from, inter, to);
			System.out.println("Moving disc " + numberofDiscs + " from " + from + " to " + to);
			move(numberofDiscs - 1, inter, to, from);
		}
	}
}
