package Lab2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		double mark;
		String line;
		char[][] answer;
		int student;
		int x = 1;
		
		Scanner in = new Scanner(System.in);
		//do-while loop until student input = 0
		do {
			//Input Student
			student = in.nextInt();
			
			if(student == 0)
				break;
			
			//skipping next line leftover
			in.nextLine();
			
			//Input key answer to index 0
			line = in.nextLine();
			line = line.toUpperCase();
			answer = new char[(student+1)][line.length()];
			answer[0] = line.toCharArray();
			
			//Input student answer start index 1
			for(int n=1;n<=student;n++) {
				line = in.nextLine();
				line = line.toUpperCase();
				answer[n] = line.toCharArray();
			}
			
			System.out.println("Case #"+x+":");

			//loop for student start index 1
			for(int r=1;r<answer.length;r++) {
				mark = 0;
				for(int c=0;c<answer[r].length;c++) {
					if(answer[0][c] == answer[r][c])
						mark = mark + 1;
					else
						mark = mark - 0.25;
				}
				DecimalFormat df = new DecimalFormat("0.00");
				System.out.print("Student "+ (r) + ": " + df.format(mark));
				System.out.println();
			}
			
			x++;

		}while (student != 0);
		
	}

}
