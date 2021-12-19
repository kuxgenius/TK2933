package Lab1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HowManyWon {

	public static void main(String[] args) {
		int n, x;
		double ringgit;
		
		Scanner in = new Scanner (System.in);
		//Input loop
		n = in.nextInt();
		
		for (x=1;x<=n;x++) {
			//Input RM
			ringgit = in.nextDouble();
			
			//Process 
			double won = ringgit * 278.82;
			
			//Output
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Case #" + x + ": " + df.format(won));	
		}
	}
}
