package Practice2;
import java.util.Scanner;

public class birthday {

	public static void main(String[] args) {
		String line;
		int n,c=1;
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

		Scanner in = new Scanner(System.in);
		do {
			n = in.nextInt();
			
			if (n==0)
				break;
			
			in.nextLine();
			
			String[] mm = new String[12];
			for(int x=1; x<=n; x++) {
				line = in.nextLine();
				String[] date = line.split(" ",0);
				int dd = Integer.valueOf(date[1]);
				if(mm[(dd-1)]==null)
					mm[(dd-1)]="*";
				else
					mm[(dd-1)]+="*";
			}
			System.out.println("Case #"+c+":");
			for (int i=0; i<12; i++) {
				if(mm[i]==null)
					mm[i]="";
				System.out.println(month[i]+":"+mm[i]);
			}
			
			c++;
			
		}while(n!=0);
		
	}

}
