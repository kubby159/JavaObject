package ch12;

public class Person {

	String name;
	int age;

	// default constructor
	public Person() {
		// 자동으로 같은 성질을 가지고 있는 생성자를 찾는다.(다른 생성자를 호출하는 this)
		this("no name", 1);
	}

	// customized constructor
	public Person(String name, int age) {
		// 자기 자신의 멤버변수를 호출할 때 this
		this.name = name;
		this.age = age;
	}

	public Person getPerson() {
		return this;
	}

	public void showPerson() {
		System.out.println(name + " , " + age);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		Person person2 = person.getPerson();
		System.out.println(person2);

	}
}
