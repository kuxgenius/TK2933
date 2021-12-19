package Practice4c;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestSavingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double amount;
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			amount = in.nextDouble();
			
			SavingAccount acc = new SavingAccount(amount);
			acc.addInterest();
			System.out.println("Case #"+i+": "+df.format(acc.getBalance()));
		}
		
	}

}
