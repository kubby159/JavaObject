package ch24;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	ArrayList<Subject> subjectlist;

	public Student() {
	}

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;

		subjectlist = new ArrayList<>();
	}

	public void addSubject(String subjectTitle, int score)

	{
		subjectlist.add(new Subject(subjectTitle, score));
	}

	public void showStudentInfo() {
		int total = 0;
		for (int i = 0; i < subjectlist.size(); i++) {
			System.out.println("학생 " + studentName + "의 " + subjectlist.get(i).subjectTitle + " 과목 성적은"
					+ subjectlist.get(i).score + "점 입니다.");

			total += subjectlist.get(i).score;
		}

		System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");

	}
}
