package Lab4AStage3;

public class MobileDevice {
	private String manufacturer,model;
	private int batteryStatus;
	private final int FULL_BATTERY = 100;
	private final boolean LOW_BATTERY = true;
	
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
	
	public boolean needCharging() {
		if(getBatteryStatus() <= 10) {
			return LOW_BATTERY;
		}
		return false;
	}
	
	public void recharge() {
		setBatteryStatus(FULL_BATTERY);
	}
	
	public void printDetails() {
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Model: "+model);
		System.out.println("Battery Status: "+batteryStatus);
	}
	
}
