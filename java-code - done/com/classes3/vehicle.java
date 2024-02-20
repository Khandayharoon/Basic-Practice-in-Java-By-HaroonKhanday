package com.classes3;

public class vehicle {

	private int vehicleNumber;
	String name;
	String type;

	public vehicle() {
	}

	public vehicle(int vehicleNumber, String name, String type) {
		this.vehicleNumber = vehicleNumber;
		this.name = name;
		this.type = type;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void print() {
		System.out.println("Vehicle ID " + vehicleNumber + " Vehicle name " + name + " vehicle Type  " + type);
	}
}
