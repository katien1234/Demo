
public class Motorcycle extends Vehicle {

	private boolean helmetRequired;

	public Motorcycle(String typeOfVehicle, int numberOfWheels, boolean working, boolean helmetRequired) {
		super(typeOfVehicle, numberOfWheels, working);

		this.setHelmetRequired(helmetRequired);

	}

	public void setHelmetRequired(boolean helmetRequired) {
		this.helmetRequired = helmetRequired;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.helmetRequired;

	}

}
