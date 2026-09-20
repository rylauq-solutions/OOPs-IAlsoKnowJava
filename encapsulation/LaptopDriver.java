package encapsulation;

class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setDetails("HP", 256);
		System.out.println(l1);

		System.out.println("\n<====================>\n");

		Laptop l2 = new Laptop();
		l2.setName("Dell");
		l2.setStorage(512);
		System.out.println("Name of Company: " + l2.getName());
		System.out.println("It has storage of " + l2.getStorage() + " GB.");
	}
}