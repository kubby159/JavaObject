package ch15;

public class Taxi {

	String TaxiName;
	int income;

	public Taxi(String TaxiName) {
		this.TaxiName = TaxiName;

	}

	public void take(int income) {
		this.income += income;
	}

	public void showTaxiInfo() {
		System.out.println(TaxiName + "����ý� ������ " + income + "�Դϴ�.");
	}
}
