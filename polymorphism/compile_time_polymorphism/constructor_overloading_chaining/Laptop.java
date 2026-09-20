package polymorphism.compile_time_polymorphism.constructor_overloading_chaining;

class Laptop {
	String name;
	int productId;
	double price;
	String processor;
	int storage;

	Laptop() {
		System.out.println("Object of Laptop is created!");
	}

	Laptop(String name) {
		this();
		this.name = name;
	}

	Laptop(String name, int productId) {
		this(name);
		this.productId = productId;
	}

	Laptop(String name, int productId, double price) {
		this(name, productId);
		this.price = price;
	}

	Laptop(String name, int productId, double price, String processor) {
		this(name, productId, price);
		this.processor = processor;
	}

	Laptop(String name, int productId, double price, String processor, int storage) {
		this(name, productId, price, processor);
		this.storage = storage;
	}

	public void getDetails() {
		System.out.println("Name of laptop is: " + name);
		System.out.println("Product ID of laptop is: " + productId);
		System.out.println("The price of laptop is: " + price);
		System.out.println("Processor used in laptop is: " + processor);
		System.out.println("The storage in laptop is: " + storage + " GB");
	}
}