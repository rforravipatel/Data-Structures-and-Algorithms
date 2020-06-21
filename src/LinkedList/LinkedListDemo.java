package LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		linkedList.insertAtHead(34);
		linkedList.insertAtHead(18);
		linkedList.insertAtHead(15);
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(3);
		linkedList.insertAtHead(2);
		linkedList.insertAtHead(1);

		linkedList.insertAtSortedArray(7);

//		linkedList.deleteFromHead();
		System.out.println(linkedList);

		System.out.println("Length: " + linkedList.length());

		System.out.println("Find 15: " + linkedList.find(15));
	}
}
