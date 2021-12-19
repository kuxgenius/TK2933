package Lab4BStage4;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> stdList;
	int totalA,totalF;
	public StudentList() {
		stdList = new ArrayList<Student>();
		totalA=0;
		totalF=0;
	}
	
	public ArrayList<Student> getStudentList() {
		return stdList;
	}
	
	public boolean addStudent(Student m) {
		boolean check = true;
		for (Student std : stdList) {
			if(!std.getMatrix().equals(m.getMatrix())) {
				check = true;
			}
			else {
				check = false;
				break;
			}
		}
		if (check == true)
			stdList.add(m);
		return check;
		
	}
	
	public int calculateAstudents(ArrayList<Student> list) {
		for(Student n : list) {
			if (n.getGrade().equals("A"))
				totalA++;	
		}
		return totalA;
	}
	
	public int calculateFstudents(ArrayList<Student> list) {
		for(Student n : list) {
			if (n.getGrade().equals("F"))
				totalF++;	
		}
		return totalF;
	}
}
