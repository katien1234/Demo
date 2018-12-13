
public abstract class Vehicle {

	private String typeOfVehicle;
	private int numberOfWheels;
	private boolean working;
	private static int counterid;
	private int id;

	public Vehicle(String typeOfVehicle, int numberOfWheels, boolean working) {

		this.setTypeOfVehicle(typeOfVehicle);
		this.setNumberOfWheels(numberOfWheels);
		this.setWorking(working);
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	@Override
	public String toString() {
		return typeOfVehicle + " " + numberOfWheels + " " + working;

	}

	public void setid() {
		this.counterid++;
		this.setId(counterid);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
