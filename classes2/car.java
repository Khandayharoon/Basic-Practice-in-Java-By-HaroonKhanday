package classes2;

public class car extends Vehicle {
	
	int numDoors;
	int numGears;
	
	public car() {
		System.out.println("Car's construtor");
		this.numDoors =4;
		this.numGears =5;
	}
	public car(int numDoors , int numGears) {
		this.numDoors = numDoors;
		this.numGears = numGears;
	}

	public void print() {
		System.out.println("Number od Doors in a car" + numDoors + "Number of Gears "+ numGears);
	}
	public void printMaxSpeed() {
		super.maxSpeed =150;
		System.out.println("Max Speed is " + maxSpeed);
	}
	public boolean isMotorized() {
		return true;
	}
}
