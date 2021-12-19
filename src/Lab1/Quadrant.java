package Lab1;
import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		int n, i, x, y;
		Scanner in = new Scanner (System.in);
		// input loop
		n = in.nextInt();
		
		for (i=1;i<=n;i++) {
			//input x, y
			x = in.nextInt();
			y = in.nextInt();
			
			if (x>0 && y>0) //check Q1
			{
				System.out.println("Case #" + i + ": Q1");
			}
			else if (x<0 && y>0) //check Q2
			{
				System.out.println("Case #" + i + ": Q2");
			}
			else if (x<0 && y<0) //check Q3
			{
				System.out.println("Case #" + i + ": Q3");
			}
			else if (x>0 && y<0) //check Q4
			{
				System.out.println("Case #" + i + ": Q4");
			}
			else //else is Axis
			{
				System.out.println("Case #" + i + ": AXIS");
			}
		}
	}

}
