package ch04;

public class studentTest {

	public static void main(String[] args) {

		// Student class 불러오는 방법

		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.address = "서울 강남";
		studentLee.setStudentName("이순신");
		studentLee.showStudentInfo();

		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "강감찬";
		studentKim.address = "인천 주안";
		studentKim.showStudentInfo();
	}
}
