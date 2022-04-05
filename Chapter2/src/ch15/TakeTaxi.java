package ch15;

public class TakeTaxi {

	public static void main(String[] args) {

		Student studentE = new Student("Edward", 20000);
		Taxi TaxiCompany = new Taxi("Àß °£´Ù");
		studentE.takeTaxi(TaxiCompany);

		studentE.showStudentInfo();
		TaxiCompany.showTaxiInfo();

	}

}
