package Lab2;
import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		int n = 1;
		String line = new String();
		//initialize all character
		char[] charArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		Scanner in = new Scanner (System.in);
		
		do {
			//input line and convert to lower case
			line = in.nextLine();
			line = line.toLowerCase();
			if(line.equals("#"))
				break;
			System.out.print("Case #"+n+": ");
			//convert line to character array
			for(int i=0;i<charArr.length;i++) {
				int count = 0;
				char[] charline = line.toCharArray();
				for (int c=0;c<charline.length;c++)
					if (charline[c] == charArr[i])
						count++;
				//Display only character have value
				if (count != 0)
					System.out.print(charArr[i]+"("+count+") ");
			}
			System.out.println();
			n++;
		}while (line.equals("#")==false);
	}

}
