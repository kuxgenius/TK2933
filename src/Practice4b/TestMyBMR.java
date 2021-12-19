package Practice4b;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestMyBMR {

	public static void main(String[] args) {
		int n,age,gender,activity;
		double weight,height;
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			weight = in.nextDouble();
			height = in.nextDouble();
			age = in.nextInt();
			gender = in.nextInt();
			activity = in.nextInt();
			
			MyBMR a = new MyBMR(weight,height,age,gender);
			System.out.print("Case #"+i+": "+df.format(a.getBMR())+" ");
			a.getDCR(activity);
			System.out.println();
		}
	}

}
