package polymorphism.compile_time_polymorphism.constructor_overloading_chaining;

class Fruit {
	String name;
	double weightInKg;
	String color;

	Fruit() {
		System.out.println("Object for Fruit class is created!");
	}

	Fruit(String name) {
		this();
		this.name = name;
	}

	Fruit(String name, double weightInKg) {
		this(name);
		this.weightInKg = weightInKg;
	}

	Fruit(String name, double weightInKg, String color) {
		this(name, weightInKg);
		this.color = color;
	}

	public void getDetails() {
		System.out.println("Name of fruit: " + name);
		System.out.println("Weight (in KG) of fruit: " + weightInKg);
		System.out.println("Color of fruit: " + color);
	}
}