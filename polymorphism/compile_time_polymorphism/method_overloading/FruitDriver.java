package polymorphism.compile_time_polymorphism.method_overloading;

public class FruitDriver {
	public static void main(String[] args) {
		Fruit f1 = new Fruit();

		f1.displayFruitDetails("Apple");
		System.out.println("\n<====================>\n");
		f1.displayFruitDetails("Banana", "Yellow");
		System.out.println("\n<====================>\n");
		f1.displayFruitDetails("Mango", "Yellow", 80);
	}
}
