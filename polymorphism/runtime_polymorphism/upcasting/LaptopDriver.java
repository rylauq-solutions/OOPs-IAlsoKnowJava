package polymorphism.runtime_polymorphism.upcasting;

public class LaptopDriver {
	public static void main(String[] args) {
		// Upcasting: Treating GamingLaptop as a Laptop
		Laptop l1 = new GamingLaptop();

		l1.turnOn(); // Calling overridden method

		// myLaptop.enableRGBLighting(); /* Not allowed, since enableRGBLighting() is not in Laptop class. */

	}
}