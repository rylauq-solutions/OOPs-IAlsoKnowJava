package abstraction.abstract_class;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1 = new ElectricCar();
		v1.start(); // Runtime Polymorphism
		v1.start();

		Car c1 = (Car) v1; // Downcasting
		c1.openGate();
		c1.playMusic();
	}
}
