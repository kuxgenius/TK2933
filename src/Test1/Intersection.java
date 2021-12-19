package Test1;
import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		int[][] arr;
		int n;
		int x = 1;
		Scanner in = new Scanner(System.in);
		do {
			n = in.nextInt();
			
			if(n==0)
				break;
			
			arr = new int [n][n];
			
			for(int r=0; r<arr.length; r++) {
				for (int c=0; c<arr[r].length; c++) {
					arr[r][c] = in.nextInt();
				}
			}
			
			System.out.println("Case #" +x+ ": ");
			
			for(int r=0; r<arr.length; r++) {
				for (int c=0; c<=r; c++) {
					if(arr[r][c] == 1 && arr[r][c] == arr[c][r]) {
							System.out.println("["+r+","+c+"]["+c+","+r+"]");
					}
							
				}
			}
			
			x++;
			
		}while (n!=0);
		

	}

}
