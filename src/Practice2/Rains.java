package Practice2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Rains {

	public static void main(String[] args) {
		double[][] rains;
		int Styear,Enyear,n=1;
		double hi,low,avg,total;
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		Scanner in = new Scanner(System.in);
		
		do {
			Styear = in.nextInt();
			Enyear = in.nextInt();
			if(Styear == 0 && Enyear == 0)
				break;
			
			int year = (Enyear-Styear)+1;
			rains = new double [year][12];
			
			System.out.println("Case #"+n+":");
			
			for (int r=0; r<year; r++) {
				hi=0;
				low=Integer.MAX_VALUE;
				avg=0;
				total=0;
				int IndexHi=0,IndexLo=0;
				for (int c=0; c<12; c++) {
					rains[r][c] = in.nextDouble();
					if (rains[r][c]>hi) {
						hi = rains[r][c];
						IndexHi = c;
					}
					if (rains[r][c]<low) {
						low = rains[r][c];
						IndexLo = c;
					}
					total += rains[r][c];
				}
				avg=total / 12;
				DecimalFormat df = new DecimalFormat("0.00");
				//Year 2008: Avg: 7.76 Lo: Jul Hi: Nov
				System.out.println("Year "+(Styear+r)+": Avg: "+df.format(avg)+" Lo: "+month[IndexLo]+" Hi: "+month[IndexHi]);
			}
			
			n++;

		}while ((Styear != 0) && (Enyear != 0));
		
	}

}
