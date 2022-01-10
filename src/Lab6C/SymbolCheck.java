package Lab6C;

import java.util.Scanner;

public class SymbolCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int x;
		Scanner in = new Scanner (System.in);
		
		x = in.nextInt();
		in.nextLine();
		for(int i = 1; i<=x; i++) {
			
			input = in.nextLine();
			char[] ch = input.toCharArray();
			Stack<Character> s = new Stack<Character>();
			Queue<Character> q = new Queue<Character>();
			
			for (char c : ch) {
				if (c == '(' || c == '[') {
					s.push(c);
				}
				else if (c == ')') {
					if (s.isEmpty() != true) {
						char temp = s.pop();
						if (temp != '(') {
							q.enqueue(c);
							s.push(temp);
						}
					}
					else
						q.enqueue(c);
					
					//else {
					//	System.out.println("One tag closed");
					//}
				}
				else if (c == ']') {
					if (s.isEmpty() != true) {
						char temp = s.pop();
						if (temp != '[') {
							q.enqueue(c);
							s.push(temp);
						}
					}
					else
						q.enqueue(c);
					//else {
					//	System.out.println("One tag closed");
					//}
				}
			}
			
			if(s.isEmpty() == true && q.isEmpty() == true)
				System.out.println("Balance");
			else
				System.out.println("Not balance");
			
		}
	}

}
