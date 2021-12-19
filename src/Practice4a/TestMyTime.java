package Practice4a;

import java.util.Scanner;

public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startHour, startMinute, endHour, endMinute, n;
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
			
		for (int i=1; i<=n; i++) {
			startHour = in.nextInt();
			startMinute = in.nextInt();
			
			MyTime time = new MyTime(startHour,startMinute);
			
			endHour = in.nextInt();
			endMinute = in.nextInt();
			
			System.out.print("Case #"+i+": ");
			time.endTime(endHour, endMinute);
			System.out.println();
		}
				
	}

}
