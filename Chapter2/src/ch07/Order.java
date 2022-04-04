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
		System.out.println("�ֹ���ȣ: " + orderNumber);
		System.out.println("�ڵ�����ȣ: " + phoneNumber);
		System.out.println("�ֹ� �� �ּ�: " + address);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�ֹ� ����: " + orderPrice);
		System.out.println("�޴� ��ȣ: " + menuNumber);

	}
}
