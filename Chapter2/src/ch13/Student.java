package ch13;

public class Student {

	String studentName;
	int grade;
	int money;

	public Student(String studentName, int moneny) {
		this.studentName = studentName;
		this.money = moneny;

	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;

	}

	public void takeSubway(Subway subway) {
		subway.take(1200);
		money -= 1200;

	}

	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}

}
