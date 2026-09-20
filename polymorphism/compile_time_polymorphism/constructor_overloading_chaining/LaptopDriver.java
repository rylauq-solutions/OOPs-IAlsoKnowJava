package polymorphism.compile_time_polymorphism.constructor_overloading_chaining;

class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Lenovo", 142135);
		Laptop l2 = new Laptop("HP", 452, 38000);
		Laptop l3 = new Laptop("Dell", 1510, 72000, "Intel i5 11th Gen", 512);

		System.out.println("\n<====================>\n");
		l1.getDetails();
		System.out.println("\n<====================>\n");
		l2.getDetails();
		System.out.println("\n<====================>\n");
		l3.getDetails();
	}
}