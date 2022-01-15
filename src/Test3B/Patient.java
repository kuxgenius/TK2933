package Test3B;

public class Patient {
	int time,treatment,type,room;
	int treatmenttime,treatedtime;
	//treatment (1 medical check,2 baby care,3 outpatient care)
	//type (1 Normal, 2 Infant, 3 Elderly)
	
	public Patient(int ti, int tr, int ty,int r) {
		this.time = ti;
		this.treatment = tr;
		this.type = ty;
		this.room = r;
		setTreatmentTime();
	}
	
	public int getTime() {
		return this.time;
	}
	
	public int getTreatment() {
		return this.treatment;
	}
	
	public int getType() {
		return this.type;
	}
	
	public int getRoom() {
		return this.room;
	}
	
	public int getTreatmentTime() {
		return this.treatmenttime;
	}
	
	public int getTreatedTime() {
		return this.treatedtime;
	}
	
	public void setTreatmentTime() {
		if(this.treatment == 1) {
			if(this.type == 1)
				this.treatmenttime = 20;
			else if(this.type == 2)
				this.treatmenttime = 15;
			else if(this.type == 3)
				this.treatmenttime = 25;
		}
		else if(this.treatment == 2) {
			if(this.type == 2)
				this.treatmenttime = 13;
		}
		else if(this.treatment == 3) {
			if(this.type == 1)
				this.treatmenttime = 10;
			else if(this.type == 2)
				this.treatmenttime = 12;
			else if(this.type == 3)
				this.treatmenttime = 21;
		}
		 
	}
	
	public void setTreatedTime(int tt) {
		this.treatedtime = tt;
	}
}
