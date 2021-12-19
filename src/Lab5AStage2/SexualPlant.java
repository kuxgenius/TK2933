package Lab5AStage2;

public class SexualPlant extends Plant{
	private double size;
	private boolean hasSeeds;
	private String pollinationAgent;
	private final double GROWTH_RATE_INDOOR = 0.25;
	private final double GROWTH_RATE_OUTDOOR = 1.25;
	
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
	
	public void determineGrowth(int days) {
		if(super.getType().equals("Indoor")) {
			size += days * GROWTH_RATE_INDOOR;
			//System.out.println("Indoor1");
		}
		else if(super.getType().equals("Outdoor")) {
			if(getPollinationAgent().equals("Birds") && (getHasSeeds() == true || getHasSeeds() == false)) {
				size += days * GROWTH_RATE_OUTDOOR;
				//System.out.println("Outdoor1");
			}
			else if (getHasSeeds() == true && getPollinationAgent().equals("Bats")) {
				size += days * 2 * GROWTH_RATE_OUTDOOR;
				//System.out.println("Outdoor2");
			}
			else if (getHasSeeds() == false && getPollinationAgent().equals("Insects")) {
				size += days * 2 * GROWTH_RATE_OUTDOOR;
				//System.out.println("Outdoor3");
			}
		}
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Size: "+getSize()+" cm");
		System.out.println("Has seeds: "+getHasSeeds());
		System.out.println("Pollination agent: "+getPollinationAgent());
	}
}
