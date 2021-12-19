package Lab6B;

import java.util.Scanner;

import Lab6A.Queue;
import Lab6A.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input,outputQ,outputS;
		int x;
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		in.nextLine();
		for(int i = 1; i<=x; i++) {
			
			input = in.nextLine();
			input = input.toLowerCase();
			
			char[] ch = input.toCharArray();
			Stack<Character> s = new Stack<Character>();
			Queue<Character> q = new Queue<Character>();
			
			for (char c : ch) {
				if ((c >= 'a' && c <= 'z')||(c >= '0' && c <= '9')) {
					s.push(c);
					q.enqueue(c);
				}
			}
			
			outputS = "";
			while(s.isEmpty() == false) {
				outputS += s.pop();
			}
			
			outputQ = "";
			while(q.isEmpty() == false) {
				outputQ += q.dequeue();
			}
			
			System.out.println(outputS+" "+outputQ);
			
			if(outputS.equals(outputQ))
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}
				
	}

}
