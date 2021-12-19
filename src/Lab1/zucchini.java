package Lab1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class zucchini {

	public static void main(String[] args) {
		int n, i, x, y;
		double total = 0;
		
		Scanner in = new Scanner (System.in);
		// input loop
		n = in.nextInt();
		
		for (i=1;i<=n;i++) {
			x = in.nextInt();
			y = in.nextInt();
			
			switch (x) {
			case 1 : 
				total = y * 7.50;
				break;
			case 2:
				total = y * 6.99;
				break;
			case 3:
				total = y * 4.70;
				break;
			case 4:
				total = y * 5.30;
				break;
			case 5:
				total = y * 5.99;
				break;
			}
			
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Case #" + i + ": RM" + df.format(total));
		}

	}

}
