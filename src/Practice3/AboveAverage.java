package Practice3;
import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		int x;
		float avg,pabove,total;
		Scanner in = new Scanner (System.in);
		
		x = in.nextInt();
		for (int i=0; i<x; i++) {
			//input until -1
			int m=0;
			int[] mark = new int[101];
			do {
				mark[m] = in.nextInt();
				if (mark[m] == -1)
					break;
				m++;
			}while (mark[m]!= -1);
			
			//calculate total and avg
			int indexof = search(mark,-1);
			total = 0;
			avg = 0;
			for (int s=0; s<indexof; s++) {
				total +=mark[s];
				
			}
			avg = total / indexof;
			int ravg = Math.round(avg);
			float above = 0;
			for (int s=0; s<indexof; s++) {
				if(mark[s]>ravg)
					above++;
			}
			pabove = (above/indexof)*100;
			int rabove = Math.round(pabove);
			System.out.println("Case #"+(i+1)+": "+ravg+" "+rabove+"%");
		}
	}
	
	public static int search(int[] list, int key){

		for (int i=0; i<list.length; i++) {
			if (key == list[i])
				return i;
			}
		return -1;
	}

}


