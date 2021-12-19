package Lab4BStage3;

public class Student {
	private String firstName,lastName,matrix,phoneNo;
	private double individualAssignment,groupProject,finalExam,continuousAsssessment,finalExam40percent,allMarks;
	
	public Student(String fn, String ln, String ma, String pn, double ia, double gp, double fe) {
		this.firstName = fn;
		this.lastName = ln;
		this.matrix = ma;
		this.phoneNo = pn;
		this.individualAssignment = ia;
		this.groupProject = gp;
		this.finalExam = fe;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getMatrix() {
		return this.matrix;
	}
	
	public String getPhoneNo() {
		return this.phoneNo;
	}
	
	public double getIndividualAssignmt() {
		return this.individualAssignment;
	}
	
	public double getGroupProject() {
		return this.groupProject;
	}
	
	public double getFinalExam() {
		return this.finalExam;
	}
	
	public double getContinuousAssessment() {
		return this.continuousAsssessment;
	}
	
	public double getAllMarks() {
		return this.allMarks;
	}
	
	public double getFinalExam40percent() {
		return this.finalExam40percent;
	}
	
	public void calculateContinuousAssessment() {
		continuousAsssessment = (individualAssignment + groupProject) / 200 * 60;
	}
	
	public void calculateFinalExam() {
		finalExam40percent = (finalExam/100) * 40;
	}
	
	public void calculateAllMarks() {
		allMarks = continuousAsssessment + finalExam40percent;
	}
}
