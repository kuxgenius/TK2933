package Lab4AStage2;

public class MobileDevice {
	private String manufacturer,model;
	private int batteryStatus;
	
	public MobileDevice(String ma,String mo,int bs) {
		manufacturer = ma;
		model = mo;
		batteryStatus = bs;
	}
	
	public void setManufacturer(String ma) {
		manufacturer = ma;
	}
	
	public void setModel(String mo) {
		model = mo;
	}
	
	public void setBatteryStatus(int bs) {
		batteryStatus = bs;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getBatteryStatus() {
		return batteryStatus;
	}
	
	public void printDetails() {
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Model: "+model);
		System.out.println("Battery Status: "+batteryStatus);
	}
	
}
