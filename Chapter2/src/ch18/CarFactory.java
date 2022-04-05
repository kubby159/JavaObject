package ch18;

public class CarFactory {

	private static CarFactory intance = new CarFactory();

	private CarFactory() {
	}

	public static CarFactory getIntance() {
		return intance;
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
