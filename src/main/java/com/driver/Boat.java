package com.driver;

public class Boat implements WaterVehicle{
	
	private String name;
	private int capacity;

	public Boat(){

	}
	
	public Boat(String name , int capacity) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.capacity = capacity;
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getVehicleCapacity() {
		// TODO Auto-generated method stub
		return this.capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
