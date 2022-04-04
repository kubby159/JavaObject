package ch07;

public class StudentTest {

	public static void main(String[] args) {

		Student studentTomas = new Student();
		studentTomas.height = 180;
		studentTomas.weight = 78;
		studentTomas.age = 37;
		studentTomas.studentName = "Thomas";

		studentTomas.showStudentInfo();
	}

}
