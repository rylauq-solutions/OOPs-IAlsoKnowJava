package abstraction.interfaces.functional_interface;

/**
 * Functional Interfaces are those interfaces which have only one abstract
 * method. This can be helpful for multiple-inheritance as well.
 */
public class Car implements Runnable {
	String name;

	Car() {

	}

	Car(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Run method starts:");
		drive();
		System.out.println("Run method ends!");
	}

	public void drive() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + " has travelled " + i + " km.");
		}
	}
}
