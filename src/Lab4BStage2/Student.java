package Lab4BStage2;

public class Student {
	private String firstName,lastName,matrix,phoneNo;
	private double individualAssignment,groupProject,finalExam;
	
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
}
