package Lab6A;

import java.util.Scanner;

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int x;
		Scanner in = new Scanner (System.in);
		
		x = in.nextInt();
		in.nextLine();
		for(int i = 1; i<=x; i++) {
			//For each test case, read a line of input and do the following:
			//	a. if it is a letter, push onto a stack
			//	b. if it is an asterisk
			//		if there is item in the stack
			//			pop, then enqueue to a queue
			
			input = in.nextLine();
			char[] ch = input.toCharArray();
			Stack<Character> s = new Stack<Character>();
			Queue<Character> q = new Queue<Character>();
			
			//Stack and Queue
			for (char c : ch) {
				if (c >= 'A' && c <= 'Z')
					s.push(c);
				else if (c == '*') {
					if (!s.isEmpty())
						q.enqueue(s.pop());
				}
			}
				
			//Stack output
			System.out.print("[ ");
			while (s.isEmpty() == false) {
				System.out.print(s.pop()+" ");
			}
			System.out.print("] ");
			
			//Queue output
			System.out.print("[ ");
			while (q.isEmpty() == false) {
				System.out.print(q.dequeue()+" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}
}
