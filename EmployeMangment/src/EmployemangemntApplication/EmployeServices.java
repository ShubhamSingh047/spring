package EmployemangemntApplication;

import java.util.*;

public class EmployeServices {
	HashSet<Employe> emp=new HashSet<Employe>();
	
	Employe emp1=new Employe(100,"shubham",27,"IT","Devloper",25000000);
	Employe emp2=new Employe(101,"rahul",26,"IT","tester",205000);
	Employe emp3=new Employe(102,"Sakil",29,"IT","Hr",25000);
	Scanner s=new Scanner(System.in);
	
	int id;
	String name;
	int age;
	String degination;
	String department;
	int salary;
	
	public  EmployeServices() {
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
	}
}
