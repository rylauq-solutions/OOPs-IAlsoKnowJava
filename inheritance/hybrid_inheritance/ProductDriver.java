package inheritance.hybrid_inheritance;

class ProductDriver {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Earphones", 1199);
		p1.getProductDetails();

		System.out.println("\n<====================>\n");

		Shirt s1 = new Shirt(2, "Shirt", 750, "Red", "Siyaram", 38);
		s1.getShirtDetails();

		System.out.println("\n<====================>\n");

		Laptop l1 = new Laptop(3, "Laptop", 72000, 16, "i5 11th Gen", 512);
		l1.getDetails();

		System.out.println("\n<====================>\n");

		Mobile m1 = new Mobile(4, "Mobile", 89000, 8, "Apple A2", 256, "iOS", 17);
		m1.getMobileDetails();
	}
}
