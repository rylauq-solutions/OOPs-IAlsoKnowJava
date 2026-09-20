package encapsulation;

class User {
	private String name;
	private int id;

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

	// ! getters() method for ID
	public int getId() {
		// Validation
		return id;
	}

	// ! setters() method for ID
	public void setId(int id) {
		// Validation
		this.id = id;
	}

	public void setDetails(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "User Name is: " + name + ",\tUser ID is: " + id;
	}
}