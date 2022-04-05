package ch15;

public class Student {

	String studentName;
	int money;

	public Student(String studentName, int money) {

		this.studentName = studentName;
		this.money = money;

	}

	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money -= 10000;
	}

	public void showStudentInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
