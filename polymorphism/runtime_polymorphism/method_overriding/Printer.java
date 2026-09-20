package polymorphism.runtime_polymorphism.method_overriding;

class Printer {
	String name;
	int capacity;
	String type;

	Printer() {
		System.out.println("Printer Object is created!");
	}

	Printer(String name, int capacity, String type) {
		this.name = name;
		this.capacity = capacity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Printer is of " + name + " company with " + capacity + " pages and of " + type + " type.";
	}

	@Override
	public boolean equals(Object o) {
		Printer p = (Printer) o;
		return this.name.equalsIgnoreCase(p.name) && this.capacity == p.capacity && this.type == p.type;
	}
}
