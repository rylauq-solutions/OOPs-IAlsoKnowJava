package abstraction.interfaces.normal_interface;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1 = new ElectricCar();
		v1.start(); // Runtime Polymorphism
		v1.stop();
		v1.test();

		Car c1 = (Car) v1; // Downcasting
		c1.openGate();
		c1.test();
	}
}