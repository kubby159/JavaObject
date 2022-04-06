package ch20;

public class ArrayTest {

	public static void main(String[] args) {
//		int[] arr = new int[10];
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int total = 0;

		for (int i = 0; i < arr.length; i++) {

			total += arr[i];
			System.out.println(total);

		}

		// 처음부터 끝까지 돌고싶을 때 사용한다.
		// num 에 arr의 요소들이 하나씩 들어간다.
		for (int num : arr) {
			total += num;

		}
	}
}
