package ch06;

public class Student {

	// 자동 초기화됨.
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
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학생 입니다.";
	};

}
