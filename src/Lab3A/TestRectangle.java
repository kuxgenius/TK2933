package Lab3A;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle test = new Rectangle();
		double h,w;
		int n;
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		n = in.nextInt();
		
		for(int c=1; c<=n; c++) {
			w = in.nextDouble();
			h = in.nextDouble();
			
			test.setHeight(h);
			test.setWidth(w);
			
			System.out.println("Case #"+c+": "+df.format(test.getWidth())+" "+df.format(test.getHeight())+" "+df.format(test.getArea())+" "+df.format(test.getPerimeter()));

		}

	}

}
