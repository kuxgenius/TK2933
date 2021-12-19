package Practice3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Soda {

	public static void main(String[] args) {
		int n,a=1;
		int[][] soda;
		double avg;
		Scanner in = new Scanner(System.in);
		do {
			n = in.nextInt();
			
			if (n==0)
				break;
			
			soda = new int[n][4];
			double[] total = {0.0,0.0,0.0,0.0};
			for (int x=0; x<soda.length; x++) {
				for (int c=0; c<4; c++) {
					soda[x][c]=in.nextInt();
				}
			}
			
			for (int r=0; r<soda.length;r++) {
				total[0]+=soda[r][0];
				total[1]+=soda[r][1];
				total[2]+=soda[r][2];
				total[3]+=soda[r][3];
			}
			
			//formula total/n
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Case #"+a+": ");
			
			for (int o=0; o<4;o++) {
				avg = total[o] / n;
				System.out.println("Soda-"+(o+1)+": "+df.format(avg)+" ");
				//System.out.println("Soda-"+(o+1)+" Total: "+total[o]);
				//System.out.println("Soda-"+(o+1)+" n: "+n);
			}
			
			a++;

		}while(n!=0);
		
	}

}
