package Practice1;
import java.util.Scanner;

public class FloorTiles {

	public static void main(String[] args) {
		int n, i, x, y, tilesx, tilesy, totalt;
		
		Scanner in = new Scanner (System.in);
		
		n= in.nextInt();
		
		for (i=1;i<=n;i++) {
			x = in.nextInt();
			y = in.nextInt();
			
			tilesx = x / 30;
			if ((x % 30) != 0)
				tilesx += 1;
			
			tilesy = y / 30;
			if ((y % 30) != 0)
				tilesy += 1;
			
			totalt = tilesx * tilesy;
			
			System.out.println("Case #" + i + ": " + totalt);
		}

	}

}
