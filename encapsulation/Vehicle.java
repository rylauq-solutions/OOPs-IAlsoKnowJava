package encapsulation;

class Vehicle {
	private String name;
	private double price;

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

	// ! getters() method for Price
	public double getPrice() {
		// Validation
		return price;
	}

	// ! setters() method for Price
	public void setPrice(double price) {
		// Validation
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle Company is: " + name + " & its Price is: " + price + " lakhs.";
	}
}