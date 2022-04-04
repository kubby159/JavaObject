package ch07;

public class Order {

	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String menuNumber;

	public Order(String orderNumber, String phoneNumber, String address, String orderDate, String orderTime,
			int orderPrice, String menuNumber) {

		this.orderNumber = this.phoneNumber = phoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNumber = menuNumber;

	}

	public void showOrderInfo() {
		System.out.println("주문번호: " + orderNumber);
		System.out.println("핸드폰번호: " + phoneNumber);
		System.out.println("주문 집 주소: " + address);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + orderPrice);
		System.out.println("메뉴 번호: " + menuNumber);

	}
}
