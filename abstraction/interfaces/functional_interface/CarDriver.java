package abstraction.interfaces.functional_interface;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car("Tata");
		Car c2 = new Car("Mahindra");
		Car c3 = new Car("Land Rover");

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(new Car("Skoda"));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}