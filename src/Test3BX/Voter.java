package Test3BX;

import java.util.*;

public class Voter {
	private int arrivalTime; // 0..60, the minute of the hour when a voter arrives
	private int serviceTime; // depends on types of voter
	private int voterType; //normal (1), disable (2), fussy (3),

	public Voter(int arrTime, int vType) {
		arrivalTime = arrTime;
		voterType = vType;
		setServiceTime(vType);

	}

	public void setArrivalTime(int arrTime) {
		arrivalTime = arrTime;
	}
	
	public void setServiceTime(int vType) {
		if(vType == 1)
			serviceTime=5;
		else if(vType == 2)
			serviceTime=7;
		else if(vType == 3)
			serviceTime=10;
	}
	
	public int getArrivalTime() {
		return arrivalTime;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public int getVoterType() {
		return voterType;
	}

}

