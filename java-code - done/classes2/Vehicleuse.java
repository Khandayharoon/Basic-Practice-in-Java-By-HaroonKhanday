package classes2;

public class Vehicleuse {

	public static void main(String [] args) {
		Vehicle  v;
		v = new car();
		System.out.println(v.isMotorized());
		v = new Bicycle();
		System.out.println(v.isMotorized());
	}
}
