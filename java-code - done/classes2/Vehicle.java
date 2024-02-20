package classes2;

public  abstract class Vehicle {

	String color;
	int maxSpeed;

	public Vehicle() {
	}

	public Vehicle(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		this.color = "Black";
	}

	public Vehicle(String color) {
		this.maxSpeed = 40;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return maxSpeed;
	}

	public void setSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void print() {
		System.out.println("Color of vehicle is" + color + " Speed of Vehicle is" + maxSpeed);
	}
	
	public abstract boolean isMotorized();
}
