package Lab1;
import java.util.Scanner;

public class RiceSack {

	public static void main(String[] args) {
		int n, i, x, high; 
		int rice;
				
		Scanner in = new Scanner (System.in);
		
		n = in.nextInt();
		
		for (i=1;i<=n;i++) {
			high = 0;
			for (x=0;x<10;x++) {
				rice = in.nextInt(); 
				if (rice > high)
					high = rice;
			}
			System.out.println("Case #" + i + ": " + high);
		}

	}

}
