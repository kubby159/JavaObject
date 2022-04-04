package ch07;

public class Student {

	public int height;
	public int weight;
	public String studentName;
	public int age;

	public void showStudentInfo() {
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + "kg 인 남성이 있습니다. 이름은 " + studentName + "이고 나이는 " + age
				+ "세 입니다.");
	}
}
