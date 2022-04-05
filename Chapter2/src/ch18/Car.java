package ch18;

public class Car {

	private static int carSerial = 10000;
	private int carId;

	public Car() {
		carSerial++;
		carId = carSerial;

	}

	public int getCarNum() {
		return carId;
	}

	public void setCarNum(int carNum) {
		this.carId = carNum;
	}

}
