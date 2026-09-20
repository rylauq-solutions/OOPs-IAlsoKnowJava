package encapsulation;

class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setName("Mahindra");
		v1.setPrice(25);
		System.out.println(v1);

		System.out.println("\n<====================>\n");

		Vehicle v2 = new Vehicle();
		v2.setName("Pininfarina");
		v2.setPrice(200.5);
		System.out.println(v2);
	}
}
