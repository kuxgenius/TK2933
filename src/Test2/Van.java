package Test2;

import java.util.ArrayList;

public class Van extends Vehicle {
	private int seater;
	private ArrayList<String> sightSeeing;
	private double total;
	
	public Van(String rID, String ty, int num, int d, boolean s, boolean tg, int seat, ArrayList<String> sSeeing) {
		super(rID,ty,num,d,s,tg);
		seater = seat;
		sightSeeing = sSeeing;
	}
	
	public int getSeaters() {
		return seater;
	}
	
	public ArrayList<String> getSightSeeing(){
		return sightSeeing;
	}
	
	public double calculateTotalPrice() {
		if(getSeaters() == 7) {
			total = 130 * super.getDay() * super.getNumOfVehicle() + (super.getPrice() * super.getDay());
		}
		else if(getSeaters() == 12) {
			total = 160 * super.getDay() * super.getNumOfVehicle() + (super.getPrice() * super.getDay());
		}
		return total;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Van types: "+getSeaters()+" seaters");
		System.out.println("Places for sightseeing: "+getSightSeeing().size());
		for(String ss:getSightSeeing()) {
			System.out.println(ss);
		}
		System.out.println("Total Price: "+calculateTotalPrice());
	}

}
