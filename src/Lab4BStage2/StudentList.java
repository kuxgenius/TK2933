package Lab4BStage2;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> stdList;
	
	public StudentList() {
		stdList = new ArrayList<Student>();
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
}
