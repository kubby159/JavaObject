package ch06;

public class Student {

	// �ڵ� �ʱ�ȭ��.
	public int studentNumber;
	public String studentName;
	public int grade;

	public Student() {

	}

	public Student(int studentnumber, String studentname, int grade) {

		this.studentName = studentname;
		this.studentNumber = studentnumber;
		this.grade = grade;

	}

	public String showStudentInfo()

	{
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�л� �Դϴ�.";
	};

}
