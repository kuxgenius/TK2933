package Practice4a;

import java.text.DecimalFormat;

public class MyTime {
	
	private int hour, minute;
	
	public MyTime() {
		this.hour = 0;
		this.minute = 0;
	}
	
	public MyTime(int h, int m) {
		setTime(h,m);
	}
	
	void setTime(int h, int m) {
		this.hour = h;
		this.minute = m;
	}
	
	void endTime(int h, int m) {
		this.hour += h;
		this.minute += m;
		
		if(this.minute >= 60) {
			this.hour += 1;
			this.minute -= 60;
		}
		
		if(this.hour >= 24) {
			this.hour -= 24;
		}
			
		DecimalFormat df = new DecimalFormat ("00");
		System.out.print(df.format(this.hour)+":"+df.format(this.minute)); 
	}

}
