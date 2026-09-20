package polymorphism.compile_time_polymorphism.constructor_overloading_chaining;

class Weapon {
	String name;
	int weightInGrams;
	double rangeInMeters;
	String material;

	Weapon() {
		System.out.println("Object of Weapon is created!");
	}

	Weapon(String name) {
		this();
		this.name = name;
	}

	Weapon(String name, int weightInGrams) {
		this(name);
		this.weightInGrams = weightInGrams;
	}

	Weapon(String name, int weightInGrams, double rangeInMeters) {
		this(name, weightInGrams);
		this.rangeInMeters = rangeInMeters;
	}

	Weapon(String name, int weightInGrams, double rangeInMeters, String material) {
		this(name, weightInGrams, rangeInMeters);
		this.material = material;
	}

	public void getDetails() {
		System.out.println("Name of weapon is: " + name);
		System.out.println("Weight of " + name + " is: " + weightInGrams + " grams.");
		System.out.println("Range of " + name + " is: " + rangeInMeters + " meters.");
		System.out.println(name + " is made of: " + material);
	}
}