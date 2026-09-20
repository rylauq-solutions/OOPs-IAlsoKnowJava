package inheritance.hybrid_inheritance;

class Laptop extends Product {
	String processor;
	int ram;
	int storage;

	Laptop() {
		System.out.println("Laptop Object is created!");
	}

	Laptop(int id, String name, double price, int ram, String processor, int storage) {
		super(id, name, price);
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}

	public void getDetails() {
		super.getProductDetails();
		System.out.println("Processor is: " + processor);
		System.out.println("RAM present is: " + ram + "GB");
		System.out.println("Storage available is: " + storage + "GB");
	}
}
