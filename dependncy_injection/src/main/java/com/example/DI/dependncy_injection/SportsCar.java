package com.example.DI.dependncy_injection;

public class SportsCar implements Car {

	String Owner;
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Sports Car";
	}

	@Override
	public void setOwnerName(String name) {
		// TODO Auto-generated method stub
		this.Owner=name;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return this.Owner;
	}

}
