import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> arrayOfVehicles = new ArrayList<Vehicle>();

	public void addToList(Vehicle Vehicle) {
		arrayOfVehicles.add(Vehicle);

	}

	public void print() {

		// System.out.println(arrayOfVehicles);

		arrayOfVehicles.stream().forEach(System.out::println);

	}

	public ArrayList<Integer> bills() {

		ArrayList<Integer> price = new ArrayList<Integer>();

		for (Vehicle i : arrayOfVehicles) {
			if (i instanceof Car) {
				if (i.isWorking()) {
					price.add(200);

				}

				else {
					price.add(400);
				}

			}

			else if (i instanceof Motorcycle) {
				if (i.isWorking()) {
					price.add(200);
				}

				else {
					price.add(300);
				}
			}

			else if (i instanceof Van) {
				if (i.isWorking()) {
					price.add(400);
				}

				else {
					price.add(500);

				}

			}
		}

		return price;

	}

	public void remove(int vehicleid) {

		arrayOfVehicles.removeIf(vehicle -> vehicleid == vehicle.getId());
		arrayOfVehicles.forEach(System.out::println);
		System.out.println();

	}

	public void add(Vehicle vehicle) {
		arrayOfVehicles.add(vehicle);

	}

}

/// BILL