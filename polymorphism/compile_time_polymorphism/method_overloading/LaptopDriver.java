package polymorphism.compile_time_polymorphism.method_overloading;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();

		l1.displaySpecs("Dell");
		System.out.println("\n<====================>\n");
		l1.displaySpecs("HP", "Pavilion");
		System.out.println("\n<====================>\n");
		l1.displaySpecs("Lenovo", "Thinkpad", 16);
		System.out.println("\n<====================>\n");
		l1.displaySpecs("Apple", "MacBook Pro", 32, 124999.50);
	}
}
