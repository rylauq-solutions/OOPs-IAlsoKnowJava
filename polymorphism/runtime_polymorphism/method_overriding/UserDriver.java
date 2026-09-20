package polymorphism.runtime_polymorphism.method_overriding;

class UserDriver {
	public static void main(String[] args) {
		User u1 = new User("Sohan", 1, 21, "Regular");
		User u2 = new User("Mohan", 2, 20, "Regular");
		User u3 = new User("Sohan", 1, 21, "Regular");

		System.out.println(u1.toString());
		System.out.println("\n<====================>\n");

		System.out.println(u2);
		System.out.println("\n<====================>\n");

		System.out.println(u3);
		System.out.println("\n<====================>\n");

		System.out.println("Is u1 equal to u2? " + u1.equals(u2));
		System.out.println("Is u1 equal to u3? " + u1.equals(u3));
	}
}
