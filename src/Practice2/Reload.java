package Practice2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Reload {

	public static void main(String[] args) {
		String line,reload;
		int n=1;
		Scanner in = new Scanner(System.in);
		
		do {
			line = in.nextLine();
			
			if(line.equals("*")) 
				break;
			
			//Condition 1. Start with *122*
			//2. 8 reload digit
			//3. End with #
			
			if (line.startsWith("*122*") && line.endsWith("#")) {
				reload = line.substring(line.lastIndexOf("*")+1, line.lastIndexOf("#"));
				if ((Pattern.matches("[0-9]+[\\.]?[0-9]*", reload)) && (reload.length()== 8))
					System.out.println("Case #"+n+": Valid");
				else
					System.out.println("Case #"+n+": Invalid");
			}
			else {
				System.out.println("Case #"+n+": Invalid");
			}
			n++;
		}while(!(line.equals("*")));

	}

}
