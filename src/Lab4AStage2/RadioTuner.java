package Lab4AStage2;

public class RadioTuner {
	private String station;
	private double frequency;
	
	public RadioTuner() {
		station = "Mix FM";
		frequency = 94.5;
	}
	
	public RadioTuner(String st,double fr) {
		station = st;
		frequency = fr;
	}
	
	public void setStation(String st) {
		station = st;
	}
	
	public void setFrequency(double fr) {
		frequency = fr;
	}
	
	public String getStation() {
		return station;
	}
	
	public double getFrequency() {
		return frequency;
	}
}
