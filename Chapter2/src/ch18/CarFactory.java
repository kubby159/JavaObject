package ch18;

public class CarFactory {

	private static CarFactory instance;

	private CarFactory() {
	}

	public static CarFactory getIntance() {
		if (instance == null) {
			instance = new CarFactory();

		}
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
