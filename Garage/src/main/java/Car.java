
public class Car extends Vehicle {

	public Car(String typeOfVehicle, int numberOfWheels, boolean working, String colour) { // Add each attribute for car
																							// in these brackets
		super(typeOfVehicle, numberOfWheels, working);

		this.setColour(colour);
	}

	private String colour;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.colour;
	}

}
