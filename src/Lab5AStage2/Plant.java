package Lab5AStage2;

public class Plant {
	private String name,climate,type;
	
	public Plant(String n,String cl,String t) {
		this.name = n;
		this.climate = cl;
		this.type = t;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setClimate(String cl) {
		this.climate = cl;
	}
	
	public void setType(String t) {
		this.type = t;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getClimate() {
		return this.climate;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void printDetails() {
		System.out.println("Plant Name: "+getName());
		System.out.println("Suitable Climate: "+getClimate());
		System.out.println("Plant Type: "+getType());
	}
	
}
