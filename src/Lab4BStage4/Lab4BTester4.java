package Lab4BStage4;
import java.util.*;

public class Lab4BTester4 {
	public static void main(String args[]){

		StudentList sl = new StudentList();

		Student m1 = new Student("Chan", "Meiying", "A12345", "0131234567", 80.0, 80.1, 99.0);
		Student m2 = new Student("Suraya", "Ahmad", "A12346", "0131235678", 60.0, 75.0, 99.0);
		Student m3 = new Student("BoiBoiBoy", "Boya", "A12347", "0131235678", 1.0, 30.0, 8.0);
		Student m4 = new Student("Gopal", "Maniam", "A12348", "0131235678", 50.0, 45.0, 49.0);
		Student m5 = new Student("Boya", "TokAba", "A12349", "01312356666", 80.0, 75.0, 8.0);

		addNewStudent(sl, m1);
		addNewStudent(sl, m2);
		addNewStudent(sl, m3);
		addNewStudent(sl, m4);
		addNewStudent(sl, m5);

		ArrayList <Student> std = sl.getStudentList();
		if(std == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total students: "+std.size());
		displayInfo(sl, std);
	}

	public static void addNewStudent(StudentList t, Student s){
		if(t.addStudent(s))
			System.out.println("Addition of a new member: "+s.getFirstName()+" "+s.getLastName()+" is successfull");
		else
			System.out.println("Addition of a new member: "+s.getFirstName()+" "+s.getLastName()+" has failed, because this person has been added to the list");
	}

	public static void displayInfo(StudentList t, ArrayList <Student> list ){
		double contAssessment;
		double Finalxm;
		char grade;
		int totalA, totalF;

		for	(Student m: list){
			m.calculateContinuousAssessment();
			m.calculateFinalExam();
			m.calculateAllMarks();
			m.calculateGrade();
			System.out.println(m.getFirstName()+" "+m.getLastName()+": Continuous assessment: "+m.getContinuousAssessment()+ ", Final exam: "+m.getFinalExam40percent()+ ", Overall marks: "+m.getAllMarks()+ ", GRADE: "+m.getGrade()+", Finalexam: "+m.getFinalExam());
		}

		totalA = t.calculateAstudents(list);
		totalF = t.calculateFstudents(list);

		System.out.println("Total students get an A: " +totalA);
		System.out.println("Total students get an F: " +totalF);
	}
}
