
public class Van extends Vehicle {

	private int numberOfWindows;

	public Van(String typeOfVehicle, int numberOfWheels, boolean working, int numberOfWindows) {
		super(typeOfVehicle, numberOfWheels, working);

	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

}
