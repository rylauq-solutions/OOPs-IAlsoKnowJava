package polymorphism.runtime_polymorphism.method_overriding;

class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("HP", 16, 256);
		Laptop l2 = new Laptop("Dell", 16, 512);
		Laptop l3 = new Laptop("Dell", 16, 512);

		System.out.println(l1);
		System.out.println("\n<====================>\n");

		System.out.println(l2);
		System.out.println("\n<====================>\n");

		System.out.println(l3);
		System.out.println("\n<====================>\n");

		System.out.println("Is l1 equal to l3? " + l1.equals(l3));
		System.out.println("Is l2 equal to l3? " + l2.equals(l3));
	}
}