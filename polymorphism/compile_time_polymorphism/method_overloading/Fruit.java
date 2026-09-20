package polymorphism.compile_time_polymorphism.method_overloading;

public class Fruit {
	public void displayFruitDetails(String name) {
		System.out.println("Fruit is: " + name);
	}

	public void displayFruitDetails(String name, String color) {
		System.out.println("Laptop is: " + name + " of Color: " + color);
	}

	public void displayFruitDetails(String name, String color, double price) {
		System.out.println("Laptop is: " + name + " of Color: " + color + " and Price: " + price + " rupees per KG.");
	}
}
