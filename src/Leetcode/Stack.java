package Leetcode;

import java.util.Arrays;

public class Stack {

	public int[] items = new int[10];
	public int top = -1;

	public void push(int value) {
		if (items.length - 1 == top) {
			throw new RuntimeException("Stack is full");
		}
		items[++top] = value;
	}

	public int peek() {
		if (top < 0)
			throw new RuntimeException("Stack is empty");
		return items[top];
	}

	public int pop() {
		if (top < 0)
			throw new RuntimeException("Stack is empty");
		return items[top--];
	}

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(4);
		stack.push(6);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());

	}

	@Override
	public String toString() {
		return "Stack [items=" + Arrays.toString(items) + ", top=" + top + "]";
	}

}
