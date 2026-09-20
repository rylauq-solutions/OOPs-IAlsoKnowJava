package polymorphism.runtime_polymorphism.method_overriding;

class Laptop {
	String name;
	int ram;
	int storage;

	Laptop() {
		System.out.println("Laptop Object is created!");
	}

	Laptop(String name, int ram, int storage) {
		this.name = name;
		this.ram = ram;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Laptop is of " + name + " company with " + ram + "GB RAM and " + storage + "GB ROM.";
	}

	@Override
	public boolean equals(Object o) {
		Laptop l = (Laptop) o;
		return this.name.equalsIgnoreCase(l.name) && this.ram == l.ram && this.storage == l.storage;
	}
}
