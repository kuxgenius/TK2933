package Lab6C;

//Stack.java

public class Stack<Item> {

	private Node first = null;
	private int N = 0;

	private class Node {
		private Item item;
		private Node next;
	}

	public boolean isEmpty() { 
		return first == null; 
	}

 	public void push(Item item) {
 		Node second = first;
 		first = new Node();
 		first.item = item;
 		first.next = second;
 		N++;
 	}

 	public Item pop() {
 		Item item = first.item;
 		first = first.next;
 		N--;
 		return item;
 	}

	public int size() {
		return N;
	} 

}