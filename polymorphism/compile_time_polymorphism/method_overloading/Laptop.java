package polymorphism.compile_time_polymorphism.method_overloading;

public class Laptop {
	public void displaySpecs(String brand) {
		System.out.println("Laptop Brand is: " + brand);
	}

	public void displaySpecs(String brand, String model) {
		System.out.println("Laptop Brand is: " + brand + " and Model is: " + model);
	}

	public void displaySpecs(String brand, String model, int ram) {
		System.out.println("Laptop Brand is: " + brand + " and Model is: " + model + " with " + ram + " GB RAM.");
	}

	public void displaySpecs(String brand, String model, int ram, double price) {
		System.out.println("Laptop Brand is: " + brand + " and Model is: " + model + " with " + ram
				+ " GB RAM and Price: " + price + " rupees.");
	}
}
