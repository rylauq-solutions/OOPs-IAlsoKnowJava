package polymorphism.runtime_polymorphism.method_overriding;

class User {
	String name;
	int id;
	int age;
	String category;

	User(String name, int id, int age, String category) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.category = category;
	}

	@Override
	public String toString() {
		return "User Name is: " + name + ",\tUser ID is: " + id + ",\nUser Age is: " + age + ",\tThis is " + category
				+ " User.";
	}

	@Override
	public boolean equals(Object o) {
		User user = (User) o; // ? Downcasting
		return this.name.equalsIgnoreCase(user.name) && this.id == user.id && this.age == user.age
				&& this.category.equalsIgnoreCase(user.category);
	}
}