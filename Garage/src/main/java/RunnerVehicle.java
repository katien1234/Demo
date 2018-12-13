
public class RunnerVehicle {

	public static void main(String[] args) {

		Garage Shop = new Garage();

		Vehicle mini = new Car("mini", 4, true, "blue");

		Vehicle corsa = new Car("Vauxhall", 4, true, "silver");

		Vehicle bike = new Motorcycle("harley davidson", 2, true, true);

		Vehicle superBike = new Motorcycle("bike", 2, true, true);

		Shop.addToList(bike);

		Shop.addToList(mini);

		Shop.addToList(corsa);

		Shop.remove(3);

		Shop.add(superBike);

		Shop.print();

		System.out.println(Shop.bills());

	}

}

// type class name variable = new.

/*
 * Vehicle mini = new Car("mini", 4, true); //Vehcile = reference to main
 * abstract want to use everything in said abstract mini = variable name not
 * important = new adding a new object Car - it's a new car being formed in that
 * sub class (no need for string, int etc just varibles asked in the superclass
 */