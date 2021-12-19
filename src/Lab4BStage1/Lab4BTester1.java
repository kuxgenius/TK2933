package Lab4BStage1;

import java.util.*;

public class Lab4BTester1 {
	public static void main(String args[]){
		Student m1 = new Student("Chan", "Meiying", "A12345", "0131234567", 80.0, 80.1, 99.0);
		System.out.println("STUDENT DETAILS:");
		System.out.println("First Name: "+m1.getFirstName());
		System.out.println("Last Name: "+m1.getLastName());
		System.out.println("Matrix No: "+m1.getMatrix());
		System.out.println("Phone No: "+m1.getPhoneNo());
		System.out.println("\nContinuous Assessment: ");
		System.out.println("Individual Project:"+m1.getIndividualAssignmt());
		System.out.println("Group Project:"+m1.getGroupProject());
		System.out.println("Final Exam: "+m1.getFinalExam());
	}
}
