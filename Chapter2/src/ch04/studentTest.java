package ch04;

public class studentTest {

	public static void main(String[] args) {

		// Student class �ҷ����� ���

		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.address = "���� ����";
		studentLee.setStudentName("�̼���");
		studentLee.showStudentInfo();

		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "������";
		studentKim.address = "��õ �־�";
		studentKim.showStudentInfo();
	}
}
