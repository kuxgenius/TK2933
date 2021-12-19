package Practice1;
import java.util.Scanner;
public class Cookies {

	public static void main(String[] args) {
		int i, n, cookie, box, container, bcookie, tbox, bbox, tcontainer;
		
		Scanner in = new Scanner (System.in);
		
		n = in.nextInt();
		
		for(i=1;i<=n;i++) {
			cookie = in.nextInt();
			box = in.nextInt();
			container = in.nextInt();
			
			tbox = cookie / box;
			tcontainer = tbox / container;
			bbox = tbox % container;
			bcookie = cookie % box;
			
			System.out.println("Case #" + i + ": " + tcontainer + " " + bbox + " " + bcookie);
		}
		
	}

}
