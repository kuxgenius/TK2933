package Lab4BStage3;
import java.util.*;

public class Lab4BTester3{
	public static void main(String args[]){
		StudentList sl = new StudentList();

		Student m1 = new Student("Chan", "Meiying", "A12345", "0131234567", 80.0, 80.1, 99.0);
		Student m2 = new Student("Suraya", "Ahmad", "A12346", "0131235678", 60.0, 75.0, 99.0);
		Student m3 = new Student("BoiBoiBoy", "Boya", "A12347", "0131235678", 1.0, 30.0, 8.0);
		Student m4 = new Student("Gopal", "Maniam", "A12348", "0131235678", 50.0, 45.0, 49.0);

		addNewStudent(sl, m1);
		addNewStudent(sl, m2);
		addNewStudent(sl, m3);
		addNewStudent(sl, m4);

		ArrayList <Student> std = sl.getStudentList();
		if(std == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total students: "+std.size());
		displayInfo(std);
	}

	public static void addNewStudent(StudentList t, Student m){
		if(t.addStudent(m))
			System.out.println("Addition of a new member: "+m.getFirstName()+" "+m.getLastName()+" is successfull");
		else
			System.out.println("Addition of a new member: "+m.getFirstName()+" "+m.getLastName()+" has failed, because this person has been added to the list");
	}

	public static void displayInfo(ArrayList <Student> list ){
		for	(Student m: list){
			m.calculateContinuousAssessment();
			m.calculateFinalExam();
			m.calculateAllMarks();
			System.out.println(m.getFirstName()+" "+m.getLastName()+": Continuous assessment: "+m.getContinuousAssessment()+ ", Final exam: "+m.getFinalExam40percent()+ ", Overall marks: "+m.getAllMarks());
		}
	}
}

