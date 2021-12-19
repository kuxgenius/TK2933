package Test2;

public class Vehicle {
	private String rentalID,type;
	private int numOfVehicle,day;
	private double price=0;
	private boolean snacks,tourGuide;
	
	public Vehicle (String rID, String ty, int num, int d, boolean s, boolean tg) {
		rentalID = rID;
		type = ty;
		numOfVehicle = num;
		day = d;
		snacks = s;
		tourGuide = tg;
		setPrice();
	}
	
	public void setPrice() { 
		if (snacks == true)
			price += 45;
		if (tourGuide == true)
			price += 150;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getRentalID() {
		return rentalID;
	}
	
	public String getType() {
		return type;
	}
	
	public int getNumOfVehicle() {
		return numOfVehicle;
	}
	
	public int getDay() {
		return day;
	}
	
	public boolean getSnacks() {
		return snacks;
	}
	
	public boolean getGuide() {
		return tourGuide;
	}
	
	public void printDetails() {
		System.out.println("Rental ID: "+getRentalID());
		System.out.println("Vehicle Type: "+getType());
		System.out.println("Number of vehicle rented: "+getNumOfVehicle());
		System.out.println("Number of days: "+getDay());
		if(getSnacks() == true) {
			System.out.println("Meals included: Yes");
		}
		else {
			System.out.println("Meals included: No");
		}
		if(getGuide() == true) {
			System.out.println("Tour guide needed: Yes");
		}
		else {
			System.out.println("Tour guide needed: No");
		}
	}
}
