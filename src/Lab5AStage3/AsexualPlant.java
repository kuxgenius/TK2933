package Lab5AStage3;

import java.util.ArrayList;

public class AsexualPlant extends Plant{
	private double height;
	private String propagationMethod;
	private final double GROWTH_RATE_INDOOR = 0.5;
	private final double GROWTH_RATE_OUTDOOR = 1.5;
	private int indoor=0,outdoor=0;
	
	public AsexualPlant(String n,String cl,String t,double initHeight,String pm) {
		super(n,cl,t);
		this.height = initHeight;
		this.propagationMethod = pm;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public void setPropagationMethod(String pm) {
		this.propagationMethod = pm;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getPropagationMethod() {
		return propagationMethod;
	}
	
	public void determineGrowth(int days) {
		if(super.getType().equals("Indoor")) {
			if(getPropagationMethod().equals("Stem") || getPropagationMethod().equals("Dividing")) {
				this.height += days * 2 * GROWTH_RATE_INDOOR;
				//System.out.println("Indoor1");
			}
			else if (getPropagationMethod().equals("Leaves") || getPropagationMethod().equals("Spores")) {
				this.height += days * GROWTH_RATE_INDOOR;
				//System.out.println("Indoor2");
			}
		}
		else if(super.getType().equals("Outdoor")) {
			if(getPropagationMethod().equals("Stem") || getPropagationMethod().equals("Dividing")) {
				this.height += days * 2 * GROWTH_RATE_OUTDOOR;
				//System.out.println("Outdoor1");
			}
			else if (getPropagationMethod().equals("Leaves") || getPropagationMethod().equals("Spores")) {
				this.height += days * GROWTH_RATE_OUTDOOR;
				//System.out.println("Outdoor2");
			}
		}
	}
	
	public void countIndoorPlant(ArrayList<Plant> plantList) {
		for(Plant p: plantList) {
			if (p instanceof AsexualPlant && p.getType().equals("Indoor"))
				indoor++;
		}
		System.out.println("Number of indoor AsexualPlant: "+indoor);
	}
	
	public void countOutdoorPlant(ArrayList<Plant> plantList) {
		for(Plant p: plantList) {
			if (p instanceof AsexualPlant && p.getType().equals("Outdoor"))
				outdoor++;
		}
		System.out.println("Number of outdoor AsexualPlant: "+outdoor);
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Height: "+getHeight()+" cm");
		System.out.println("Propagation Method: "+getPropagationMethod());
	}
}
