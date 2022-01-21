package Project2;

public class addOrder {
	
	String mainOrder;
	String[] toppings = new String[4];
	int unit;
	double price;
	
	public addOrder() {
		mainOrder = "";
	}
	
	public void setmainOrder(String m) {
		mainOrder = m;
	}
	
	public void addToppings(String[] t) {
		toppings = t;
	}
	
	public void setUnit(int u) {
		unit = u;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public String getMainOrder() {
		return mainOrder;
	}
	
	public String[] getToppings() {
		return toppings;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public double getPrice() {
		return price;
	}
}
