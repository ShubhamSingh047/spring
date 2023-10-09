package com.example.Customers;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class PaymentDepartment implements CustomerCare {

	private String department = "Payment Department";
	private String customerName;
	private String issue;
	private double refId;

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return this.department;
	}

	@Override
	public void getService() {
		// TODO Auto-generated method stub
		System.out.println(" Welcome " + this.customerName + ", you have reached the payments department");
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
				"Dear " + this.customerName + " your  issue for " + this.issue + " is registered with Payments\" ");
	}

}
