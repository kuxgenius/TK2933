package Lab6A;

//Queue.java

public class Queue<Item> {
	private Node first, last;
	int N = 0;

	private class Node { 
		Item item; 
		Node next; 
	}

	public boolean isEmpty() { 
		return first == null; 
	}

	public void enqueue(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) first = last;
		else oldlast.next = last;
		N++;
	}

	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		N--;
		if (isEmpty()) 
			last = null;
		return item;
	}

	public int size() {
		return N;
	} 

}
