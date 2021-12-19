package Practice1;
import java.util.Scanner;

public class TimeSecond {

	public static void main(String[] args) {
		
		int n, i, v, sec, min, hour;
		
		Scanner in = new Scanner (System.in);
		
		n = in.nextInt();
		
		for (i=1;i<=n;i++) {
			v = in.nextInt();
			sec = v % 60;
			hour = v / 3600;
			min = (v % 3600) / 60;
			
			System.out.println("Case #" + i + ": " + hour + ":" + min + ":" + sec);
		}
	}

}
