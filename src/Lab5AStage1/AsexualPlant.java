package Lab5AStage1;

public class AsexualPlant extends Plant{
	private double height;
	private String propagationMethod;
	
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
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Height: "+getHeight()+" cm");
		System.out.println("Propagation Method: "+getPropagationMethod());
	}
}
