package abstraction.abstract_class;

class ElectricCar extends Car {
	@Override
	public void start() {
		System.out.println("Start Electric Car!");
	}

	@Override
	public void openGate() {
		System.out.println("Open Gate for Electric Car!");
	}
}
