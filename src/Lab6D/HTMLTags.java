package Lab6D;

import java.util.Scanner;
import java.util.regex.*;

public class HTMLTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int x;
		Scanner in = new Scanner (System.in);
		
		x = in.nextInt();
		in.nextLine();
		for(int i = 1; i<=x; i++) {
			
			input = in.nextLine();
			String[] texts = input.split(" ");
			Pattern open = Pattern.compile("\\<[a-zA-Z]*\\>");
			Pattern close = Pattern.compile("\\</[a-zA-Z]*\\>");
			Stack<String> s = new Stack<String>();
			Queue<String> q = new Queue<String>();
			
			for (String a : texts) {
				Matcher m1 = open.matcher(a);
				Matcher m2 = close.matcher(a);
				
				if (m1.find()) {
					//System.out.println(m1.group(0));
					String temp = m1.group(0);
					temp = temp.substring((temp.indexOf('<')+1),temp.indexOf('>'));
					//System.out.println("Open tag "+temp);
					s.push(temp);
				}
				else if (m2.find()) {
					//System.out.println(m2.group(0));
					String temp2 = m2.group(0);
					temp2 = temp2.substring((temp2.indexOf('/')+1),temp2.indexOf('>'));
					//System.out.println("Close tag "+temp2);
					if (s.isEmpty()==false) {
						String temp3 = s.pop();
						if (!temp2.equals(temp3)) {
							q.enqueue(temp2);
							s.push(temp3);
						}
					}
					else
						q.enqueue(temp2);
					
				}
				
			}
			
			if(s.isEmpty() == true && q.isEmpty() == true)
				System.out.println("Balance");
			else
				System.out.println("Not balance");
		}
			
	}

}
