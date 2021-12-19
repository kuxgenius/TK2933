package Lab2;
import java.util.Scanner;

public class coconut {

	public static void main(String[] args) {
		int n, i;
		
		Scanner in = new Scanner (System.in);
		
		n = in.nextInt();
		
		for(i=1;i<=n;i++) {
			int x = in.nextInt();
			int max = 0; 
			int min = Integer.MAX_VALUE;
			int[] coconut = new int[x];
			for(int a=0;a<coconut.length;a++) {
				coconut[a]=in.nextInt();
				if(coconut[a]>max)
					max = coconut[a];
				if (coconut[a]<min)
					min = coconut[a];
			}
			int countmin = search(coconut,min);
			int countmax = search(coconut,max);
			System.out.println(min + " " + countmin + " " + max + " " + countmax);
		}

	}

	public static int search(int[] list, int key){
		int count = 0;
		for (int i=0; i<list.length; i++) {
			if (key == list[i]) {
				count++;
			}
		}
		return count;
	}
}
