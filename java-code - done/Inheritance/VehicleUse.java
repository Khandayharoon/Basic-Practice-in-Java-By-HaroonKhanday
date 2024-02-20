package Inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		System.out.println();
		Vehicle v = new Vehicle();
		v.maxSpeed = 0;
		v.vehicleNumber = 0;
		v.print();

		System.out.println();
		
		Car c = new Car();
		c.color = "Black";
		c.maxSpeed = 175;
		c.numbersDoors = 4;
		c.vehicleNumber = 321;
		c.print();
		
		System.out.println();
		
		Bicycle b = new Bicycle();
		b.color = "Green";
		b.maxSpeed = 23;
		b.vehicleNumber = 00;
		b.print();
	}

}
