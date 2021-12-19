package Test1;
import java.util.Scanner;

public class IdentityCard {

	public static void main(String[] args) {
		int card;
		
		Scanner in = new Scanner(System.in);
		
		int n,c;
		
		c = in.nextInt();
		
		for(int x=1;x<=c;x++) {
			int m = 0, f = 0;
			n = in.nextInt();
			for (int i=0;i<n;i++) {
				card = in.nextInt();
				if(card % 2 == 0) {
					f++;
				}
				else {
					m++;
				}
			}
			//Case #1: 2 M 3 F
			System.out.println("Case #"+x+": "+m+" M "+f+" F");
		}
		
	}

}
