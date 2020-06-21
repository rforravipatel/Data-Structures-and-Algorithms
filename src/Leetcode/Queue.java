package Leetcode;

import java.util.Arrays;

public class Queue {

	public int[] items = new int[5];
	public int head = -1;
	public int tail = -1;
	public int numberOfItems = 0;

	public void enqueue(int value) {
		if (items.length == numberOfItems) {
			throw new RuntimeException("Queue is full");
		}
//		if (head == -1) {
//			head++;
//		}
		if (tail == items.length - 1) {
			tail = -1;
		}
		items[++tail] = value;

		numberOfItems++;
	}

	public int dequeue() {
		if (numberOfItems == 0) {
			throw new RuntimeException("Queue is empty");
		}

		if (head == items.length - 1) {
			head = -1;
		}
		numberOfItems--;
		return items[++head];
	}

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(10);
		q.enqueue(46);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(10);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		System.out.println(q.toString());
	}

	@Override
	public String toString() {
		return "Queue [items=" + Arrays.toString(items) + ", head=" + head + ", tail=" + tail + ", numberOfItems="
				+ numberOfItems + "]";
	}

}
