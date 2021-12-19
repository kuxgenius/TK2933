package Practice4b;
import java.text.DecimalFormat;

public class MyBMR {
	private double bmr;
	DecimalFormat df =new DecimalFormat("0.00");
	
	public MyBMR(double weight, double height, int age, int gender) {
		//men 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age)
		//women 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age)
		if (gender == 1) {
			this.bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
		}
		else if (gender == 2) {
			this.bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
		}
		
	}
	
	public double getBMR() {
		return this.bmr;
	}

	void getDCR(int num) {
		if(num < 1) {
			System.out.print(df.format(this.bmr * 1.2));
		}
		else if(num >=1 && num <=3) {
			System.out.print(df.format(this.bmr * 1.375));
		}
		else if(num >=4 && num <=5) {
			System.out.print(df.format(this.bmr * 1.55));
		}
		else if(num == 6) {
			System.out.print(df.format(this.bmr * 1.725));
		}
		else if(num >=7) {
			System.out.print(df.format(this.bmr * 1.9));
		}
		
	}
}
