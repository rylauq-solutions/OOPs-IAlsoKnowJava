package polymorphism.compile_time_polymorphism.constructor_overloading_chaining;

class FruitDriver {
	public static void main(String[] args) {
		Fruit f1 = new Fruit("Orange");
		Fruit f2 = new Fruit("Apple", 1.5);
		Fruit f3 = new Fruit("Pears", 2.5, "Green");

		System.out.println("\n<====================>\n");
		f1.getDetails();
		System.out.println("\n<====================>\n");
		f2.getDetails();
		System.out.println("\n<====================>\n");
		f3.getDetails();
	}
}