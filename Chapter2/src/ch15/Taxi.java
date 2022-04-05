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
		System.out.println(TaxiName + "운수택시 수입은 " + income + "입니다.");
	}
}
