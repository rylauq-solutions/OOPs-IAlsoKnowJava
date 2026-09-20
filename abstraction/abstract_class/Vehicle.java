package abstraction.abstract_class;

/**
 * Abstract Classes are special types of classes which is used to achieve 0% to
 * 100% abstraction.
 */
abstract class Vehicle {
	public abstract void start(); // Abstract Method

	public void stop() { // Concrete Method
		System.out.println("Stop Vehicle!");
	}
}
