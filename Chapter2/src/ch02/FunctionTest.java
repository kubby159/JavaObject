package ch02;

public class FunctionTest {

	// 매개변수와 반환 값이 존재하는 함수형태
	public static int addNum(int num, int num2) {
		// result 는 {} 안에서 쓰이는 지역변수.
		int result = num + num2;
		return result;
	}

	// 매개변수는 존재하나 반환 값이 없는 함수형태
	public static void sayHell(String greeting) {
		// void = 반환값이 없는 것을 의미한다.
		System.out.println(greeting);
	}

	// 매개변수는 없고 반환 값만 존재하는 함수형태
	public static int calcSum() {
		int sum = 0;
		int i;

		for (i = 0; i < 100; i++) {
			sum += i;

		}

		return sum;

	}

	public static void main(String[] args) {

		// n1,n2도 지역변수.
		int n1 = 10;
		int n2 = 20;

		int total = addNum(n1, n2);
		System.out.println(total);

		sayHell("안녕하세요");
		int sum = calcSum();
		System.out.println(sum);
	}

}
