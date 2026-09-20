package encapsulation;

class Laptop {
	String name;
	int storage;

	// ! getters() method for Name
	public String getName() {
		// Validation
		return name;
	}

	// ! setters() method for Name
	public void setName(String name) {
		// Validation
		this.name = name;
	}

	// ! getters() method for Storage
	public int getStorage() {
		// Validation
		return storage;
	}

	// ! setters() method for Storage
	public void setStorage(int storage) {
		// Validation
		this.storage = storage;
	}

	public void setDetails(String name, int storage) {
		this.name = name;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Laptop is of " + name + " company with " + storage + "GB ROM.";
	}
}
