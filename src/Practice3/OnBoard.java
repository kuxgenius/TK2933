package Practice3;
import java.util.Scanner;

public class OnBoard {

	public static void main(String[] args) {
		int i, rows, cols;
		
		Scanner in = new Scanner(System.in);
		
		i = in.nextInt();
		
		for (int x=1; x<=i; x++) {
			rows = in.nextInt();
			cols = in.nextInt();
			
			System.out.println("Board #"+x+": "+rows+"*"+cols);
			
			for (int r=0; r<rows; r++) {
				for (int c=0; c<cols; c++) {
					System.out.print("+-");
				}
				System.out.print("+");
				System.out.println();
				for (int c=0; c<cols; c++) {
					System.out.print("| ");
				}
				System.out.print("|");
				System.out.println();
			}
			for (int c=0; c<cols; c++) {
				System.out.print("+-");
			}
			System.out.print("+");
			System.out.println();
		}

	}

}
