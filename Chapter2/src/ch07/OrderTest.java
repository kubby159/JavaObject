package ch07;

public class OrderTest {

	public static void main(String[] args) {

		Order firstOrder = new Order("202011020003", "01023451234", "서울 강남구 역삼동 111-11", "20201102", "130258", 35000,
				"0003");
		firstOrder.showOrderInfo();
	}

}
