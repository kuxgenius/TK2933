package Lab5AStage1;

public class SexualPlant extends Plant{
	private double size;
	private boolean hasSeeds;
	private String pollinationAgent;
	
	public SexualPlant(String n,String cl,String t,boolean hs,String pa) {
		super(n,cl,t);
		size = 1;
		hasSeeds = hs;
		pollinationAgent = pa;
	}
	
	public void setSize(double s) {
		this.size = s;
	}
	
	public void setHasSeeds(boolean hs) {
		this.hasSeeds = hs;
	}
	
	public void setPollinationAgent(String pa) {
		this.pollinationAgent = pa;
	}
	
	public double getSize() {
		return size;
	}
	
	public boolean getHasSeeds() {
		return hasSeeds;
	}
	
	public String getPollinationAgent() {
		return pollinationAgent;
	}
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Size: "+getSize()+" cm");
		System.out.println("Has seeds: "+getHasSeeds());
		System.out.println("Pollination agent: "+getPollinationAgent());
	}
}
