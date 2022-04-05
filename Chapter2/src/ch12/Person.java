package ch12;

public class Person {

	String name;
	int age;

	// default constructor
	public Person() {
		// �ڵ����� ���� ������ ������ �ִ� �����ڸ� ã�´�.(�ٸ� �����ڸ� ȣ���ϴ� this)
		this("no name", 1);
	}

	// customized constructor
	public Person(String name, int age) {
		// �ڱ� �ڽ��� ��������� ȣ���� �� this
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
