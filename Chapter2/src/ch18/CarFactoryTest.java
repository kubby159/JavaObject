package ch18;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getIntance();

		Car mySonata = factory.createCar();
		Car myGenesis = factory.createCar();

		System.out.println(mySonata.getCarNum());
		System.out.println(myGenesis.getCarNum());

	}

}
