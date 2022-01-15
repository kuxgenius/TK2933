package Test3A;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int n;
		int min = Integer.MAX_VALUE;
		Scanner in = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		n = in.nextInt();
		in.nextLine();
		for(int i = 1; i<=n; i++) {
			input = in.nextLine();
			String[] texts = input.split(" ");
			if(texts[0].equals("+")) {
				int v = Integer.parseInt(texts[1]);
				stack.push(v);
			}
			else if(texts[0].equals("-")) {
				if(stack.isEmpty() == false)
					stack.pop();
			}
			else if(texts[0].equals("Z")) {
				Stack<Integer> temp = stack;
				while(!temp.isEmpty()) {
					int a =temp.pop();
					if(a<min)
						min = a;
				}
				if (min % 2 == 0) 
					System.out.println("Even");
				else
					System.out.println("Odd");
			}
		}
	}

}
