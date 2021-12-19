package Test2;

import java.util.ArrayList;

public class Bicycle extends Vehicle {
	private String bikeType;
	private ArrayList<String> bikeTour;
	private double total;
	
	public Bicycle(String rID,String ty, int num, int d, boolean s, boolean tg, String bt, ArrayList<String> bTour) {
		super(rID,ty,num,d,s,tg);
		bikeType = bt;
		bikeTour = bTour;
	}
	
	public String getBikeType() {
		return bikeType;
	}
	
	public ArrayList<String> getBikeTour(){
		return bikeTour;
	}
	
	public double calculateTotalPrice() {
		if(getBikeType().equals("normal")) {
			total = 40 * super.getDay() * super.getNumOfVehicle() + (super.getPrice() * super.getDay());
		}
		else if(getBikeType().equals("tandem")) {
			total = 50 * super.getDay() * super.getNumOfVehicle() + (super.getPrice() * super.getDay());
		}
		return total;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Bicycle type: "+getBikeType()+" bike");
		System.out.println("Bicycle ride selected: "+getBikeTour().size());
		for(String tour:getBikeTour()) {
			System.out.println(tour);
		}
		System.out.println("Total Price: "+calculateTotalPrice());
	}

}
