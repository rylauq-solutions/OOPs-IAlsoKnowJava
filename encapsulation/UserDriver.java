package encapsulation;

class UserDriver {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("Sohan");
		u1.setId(1);
		System.out.println(u1);

		System.out.println("\n<====================>\n");

		User u2 = new User();
		u2.setDetails("Mohan", 2);
		System.out.println("Name is: " + u2.getName());
		System.out.println("ID is: " + u2.getId());
	}
}
