package Test2;

import java.util.ArrayList;

public class Car extends Vehicle {
	private char carSize;
	private ArrayList<String> hopTour;
	private double total;
	
	public Car(String rID,String ty, int num, int d, boolean m, boolean tg, char s, ArrayList<String> hop) {
		super(rID,ty,num,d,m,tg);
		carSize = s;
		hopTour = hop;
	}
	
	public char getCarType() {
		return carSize;
	}
	
	public ArrayList<String> getCarTour() {
		return hopTour;
	}
	
	public double calculateTotalPrice() {
		if(Character.compare(getCarType(),'S') == 0) {
			total = 80 * super.getDay() * super.getNumOfVehicle() + (super.getPrice() * super.getDay());
		}
		else if(Character.compare(getCarType(),'M') == 0) {
			total = 130 * super.getDay() * super.getNumOfVehicle() + (super.getPrice() * super.getDay());
		}
		return total;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		if(Character.compare(getCarType(),'S') == 0) {
			System.out.println("Car size: Sedan");
		}
		else if(Character.compare(getCarType(),'M') == 0) {
			System.out.println("Car size: MPV");
		}
		System.out.println("Tourist attraction selected: "+getCarTour().size());
		for(String tour:getCarTour()) {
			System.out.println(tour);
		}
		System.out.println("Total Price: "+calculateTotalPrice());
	}
}
