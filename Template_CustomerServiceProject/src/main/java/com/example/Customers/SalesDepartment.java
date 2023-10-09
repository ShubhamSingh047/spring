package com.example.Customers;
import java.util.Random;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class SalesDepartment implements CustomerCare {

	private String department = "Sales Department";
	private String customerName;
	private String issue;
	private double refId=7.10;
	Random refIds=new Random();
	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return this.department;
	}

	@Override
	public void getService() {
		// TODO Auto-generated method stub
		System.out.println(" Welcome " + this.customerName + ", you have reached the " + this.department);
	}

	@Override
	public void setCustomerName(String name) {
		// TODO Auto-generated method stub
		this.customerName = name;
	}

	@Override
	public void setProblem(String problem) {
		// TODO Auto-generated method stub
		this.issue = problem;
	}

	@Override
	public void getProblem() {
		// TODO Auto-generated method stub
		System.out.println(
				"Dear " + this.customerName + " your  issue for " + this.issue + " is registered with "+this.department+"ref id "+refIds.nextDouble());
	}
}
