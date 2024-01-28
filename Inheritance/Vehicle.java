package Inheritance;

public class Vehicle {

	String color ;
	int maxSpeed;
	int vehicleNumber;

	public void print() {
System.out.println(
				"Color is :- " + color + " Max Speed is :- " + maxSpeed + " VehicleNumber is :- " + vehicleNumber);

	}
}

class Car extends Vehicle {

	int numbersDoors;
}

class Bicycle extends Vehicle {

}
