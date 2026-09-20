package inheritance.hybrid_inheritance;

class Mobile extends Laptop {
	String osType;
	int osVersion;

	Mobile() {
		System.out.println("Mobile Object is created!");
	}

	Mobile(int id, String name, double price, int ram, String processor, int storage, String osType, int osVersion) {
		super(id, name, price, ram, processor, storage);
		this.osType = osType;
		this.osVersion = osVersion;
	}

	public void getMobileDetails() {
		super.getDetails();
		System.out.println("Mobile runs on " + osType);
		System.out.println(osType + " version of Mobile is: " + osVersion);
	}
}