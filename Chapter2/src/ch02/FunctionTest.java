package ch02;

public class FunctionTest {

	// �Ű������� ��ȯ ���� �����ϴ� �Լ�����
	public static int addNum(int num, int num2) {
		// result �� {} �ȿ��� ���̴� ��������.
		int result = num + num2;
		return result;
	}

	// �Ű������� �����ϳ� ��ȯ ���� ���� �Լ�����
	public static void sayHell(String greeting) {
		// void = ��ȯ���� ���� ���� �ǹ��Ѵ�.
		System.out.println(greeting);
	}

	// �Ű������� ���� ��ȯ ���� �����ϴ� �Լ�����
	public static int calcSum() {
		int sum = 0;
		int i;

		for (i = 0; i < 100; i++) {
			sum += i;

		}

		return sum;

	}

	public static void main(String[] args) {

		// n1,n2�� ��������.
		int n1 = 10;
		int n2 = 20;

		int total = addNum(n1, n2);
		System.out.println(total);

		sayHell("�ȳ��ϼ���");
		int sum = calcSum();
		System.out.println(sum);
	}

}
