package LinkedList;

public class LinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;

		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}

		result += "}";
		return result;
	}

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public void deleteFromHead() {
		this.head = this.head.getNextNode();
	}

	public Node find(int dataFind) {

		Node current = this.head;

		while (current != null) {
			if (current.getData() == dataFind) {
				return current;
			}
			current = current.getNextNode();
		}

		return null;

	}

	public void insertAtSortedArray(int data) {
		Node newNode = new Node(data);
		Node current = this.head;

		if (current == null) {
			this.head = newNode;
			return;
		}

		if (current.getData() > data) {
			newNode.setNextNode(this.head);
			this.head = newNode;
			return;
		}

		while (current != null && current.getNextNode() != null) {
			if (current.getNextNode()
					.getData() > data) {
				newNode.setNextNode(current.getNextNode());
				current.setNextNode(newNode);
				return;
			}

			current = current.getNextNode();
		}

		current.setNextNode(newNode);
	}

	public int length() {
		int length = 0;
		Node current = this.head;

		while (current != null) {
			length++;
			current = current.getNextNode();
		}

		return length;
	}
}
