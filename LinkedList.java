import java.util.*;

public class LinkedList {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	static void addTwoLists(Node l1, Node l2)
	{
		Node prev = null;
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		Stack<Node> s3 = new Stack<Node>();
		//first stack
		while (l1 != null) {
			s1.add(l1);
			l1 = l1.next;
		}
		// second stack 
		while (l2 != null) {
			s2.add(l2);
			l2 = l2.next;
		}
		int carry = 0;
		//third stack for sum
		while (!s1.isEmpty() && !s2.isEmpty()) {
			int sum
			  = s1.peek().data + s2.peek().data + carry;
			Node temp = new Node(sum % 10);
			s3.add(temp);
			if (sum > 9) {
				carry = 1;
			}
			else {
				carry = 0;
			}
			s1.pop();
			s2.pop();
		}
		while (!s1.isEmpty()) {
			int sum = carry + s1.peek().data;
			Node temp = new Node(sum % 10);
			s3.add(temp);
			if (sum > 9) {
				carry = 1;
			}
			else {
				carry = 0;
			}
			s1.pop();
		}
		while (!s2.isEmpty()) {
			int sum = carry + s2.peek().data;
			Node temp = new Node(sum % 10);
			s3.add(temp);
			if (sum > 9) {
				carry = 1;
			}
			else {
				carry = 0;
			}
			s2.pop();
		}
		if (carry == 1) {
			Node temp = new Node(1);
			s3.add(temp);
		}
		if (!s3.isEmpty())
			prev = s3.peek();
		while (!s3.isEmpty()) {
			Node temp = s3.peek();
			s3.pop();
			if (s3.size() == 0) {
				temp.next = null;
			}
			else {
				temp.next = s3.peek();
			}
		}
		printList(prev);
	}


	static void printList(Node head)
	{
		while (head.next != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println(head.data);
	}
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();

		// creating first list
		list.head1 = new Node(4);
		list.head1.next = new Node(8);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(3);
		list.head1.next.next.next.next = new Node(9);
		System.out.print("First List : ");
		list.printList(head1);

		// creating second list
		list.head2 = new Node(3);
		list.head2.next = new Node(6);
		System.out.print("Second List : ");
		list.printList(head2);

		System.out.print("Sum List : ");
		// the result of adding two list
		list.addTwoLists(head1, head2);
	}

}
