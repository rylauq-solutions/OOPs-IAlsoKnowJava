package inheritance.hybrid_inheritance;

class Shirt extends Product {
	String color;
	String brand;
	int size;

	Shirt() {
		System.out.println("Shirt Object is created!");
	}

	Shirt(int id, String name, double price, String color, String brand, int size) {
		super(id, name, price);
		this.color = color;
		this.brand = brand;
		this.size = size;
	}

	public void getShirtDetails() {
		super.getProductDetails();
		System.out.println("Brand of Shirt is: " + brand);
		System.out.println("Color of Shirt is: " + color);
		System.out.println("Size of Shirt is: " + size);
	}
}