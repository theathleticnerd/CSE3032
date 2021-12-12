import java.util.*;

public class Task3 {
	static class node {
		int val;
		node next;

		public node(int val) { this.val = val; }
	}

	static void removeDuplicate(node head)
	{
		HashSet<Integer> hs = new HashSet<>();
		node current = head;
		node prev = null;
		while (current != null) {
			int curval = current.val;
			if (hs.contains(curval)) {
				prev.next = current.next;
			}
			else {
				hs.add(curval);
				prev = current;
			}
			current = current.next;
		}
	}
	static void printList(node head)
	{
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args)
	{
		node start = new node(10);
		start.next = new node(12);
		start.next.next = new node(11);
		start.next.next.next = new node(11);
		start.next.next.next.next = new node(12);
		start.next.next.next.next.next = new node(11);
		start.next.next.next.next.next.next = new node(10);
		System.out.println(
			"Before removing duplicates :");
		printList(start);
		removeDuplicate(start);
		System.out.println(
			"\nAfter removing duplicates :");
		printList(start);
	}
}

