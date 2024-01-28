package com.classes3;

public class car extends vehicle implements VehicleInterface {

	private int numDoors;
	private String engineType;
	
	
	@Override
	public boolean isMOtorized() {
		return true;
	}

	@Override
	public String getCompany() {
		return "lambo";
	}

	@Override
	public String getColor() {
		return "black";
	}

	@Override
	public void print() {
		System.out.println("i am car");
	}
	
	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}
