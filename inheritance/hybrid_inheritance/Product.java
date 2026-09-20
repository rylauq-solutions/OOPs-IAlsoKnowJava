package inheritance.hybrid_inheritance;

class Product {
	int id;
	String name;
	double price;

	Product() {
		System.out.println("Object of Product is created!");
	}

	Product(int id, String name, double price) {
		this();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void getProductDetails() {
		System.out.println("Product ID is: " + id);
		System.out.println("Product Name is: " + name);
		System.out.println("Price of Product is: " + price);
	}
}
