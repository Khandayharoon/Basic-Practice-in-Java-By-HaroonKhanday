package com.classes3;

public class MainVehicleClass {

	public static void main(String[] args) {
		vehicle v = new vehicle();
		v.print();
		v.setVehicleNumber(123);
		v.print();
		v = new car();
		v.name = "lambo";
		v.getVehicleNumber();
		v.setVehicleNumber(555);
		v.print();
	}

}
