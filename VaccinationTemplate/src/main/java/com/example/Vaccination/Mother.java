package com.example.Vaccination;

import com.example.Vaccination.User;

/**
  This class is an implementation of a User Interface based on the selection 
  in the console the user type is selected.You need to complete this class 
  based on the following tasks.
    
   Tasks:
 a.Override the methods of User Interface.
 b.Adding common attributes:
    1. String name
    2. Integer age
    3. boolean isVaccinated
    4. TimeAndLocation(class), vaccine(interface), both are injected by the constructor method.
    5. The arguments of the constructor for all users should be like "public User(TimeAndLocation timeAndLocation, Vaccine vaccine)"
 c.Build the logic for all the methods based on the description mentioned in the User Interface.
 
**/
public class Mother implements User {
	  /** This method returns Vaccine object which is selected by the user in console. **/
	String name;
	int age;
	boolean isVaccinated;
	TimeAndLocation timeAndLocation;
	Vaccine vaccine;
	
	public Mother(TimeAndLocation timeAndLocation, Vaccine vaccine) {
		this.timeAndLocation=timeAndLocation;
		this.vaccine=vaccine;
	}
	
    @Override
	public Vaccine getVaccineDetails() {
    	return vaccine;
    }
    

    @Override
    public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation) {
    	this.name=name;
    	this.age=age;
    	this.timeAndLocation=timeAndLocation;
    }

    @Override
    public void setAppointment() {
    	System.out.println("Hello "+this.name+" your appointment has been fixed for "+this.vaccine.getType()+" on "+this.timeAndLocation.getDetails());
    }

    /** This function returns a boolean type indicating the vaccination status of a user. If the user is vaccinated it should return true else false. **/
    @Override
    public boolean IsVaccinated() {
    	return isVaccinated;
    }
}
