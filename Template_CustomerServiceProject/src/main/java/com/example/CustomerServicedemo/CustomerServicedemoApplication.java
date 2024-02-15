package com.example.CustomerServicedemo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

			 Tasks:
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerCare payment = (CustomerCare) context.getBean("paymentsDepartment");
		CustomerCare query = (CustomerCare) context.getBean("queryDepartment");
		CustomerCare sales = (CustomerCare) context.getBean("salesDepartment");

		Scanner scanner=new Scanner(System.in);

		System.out.println("Welcome To our Customer Care Application");
		System.out.print("Please enter your name: ");
		String name=scanner.nextLine();
		System.out.println("Thank you for reaching us "+name);
		System.out.println("Please select the department to connect:- ");
		System.out.println("1. Payment Department ");
		System.out.println("2. Query Department ");
		System.out.println("3. Sales Department ");
		System.out.println("0. Exit ");
		
		
		int num=scanner.nextInt();
		if(num==1) {
			payment.setCustomerName(name);
			System.out.println("Welcome to payment department "+name);
			System.out.println("How may i assist you with your payment inquary");
			System.out.println();
			scanner.nextLine();
			String issueString=scanner.nextLine();

			payment.setProblem(issueString);
			payment.getProblem();

		}
		else if(num==2) {
			query.setCustomerName(name);
			System.out.println("Welcome to Query department "+name);
			System.out.println("How may i assist you with your Query ");
			scanner.nextLine();
			String issueString=scanner.nextLine();
			query.setProblem(issueString);
			query.getProblem();

		}
		else if(num==3) {
			sales.setCustomerName(name);
			System.out.println("Welcome to Sales department "+name);
			System.out.println("How may i assist you with your Sales");
			System.out.println();
			scanner.nextLine();
			String issueString=scanner.nextLine();
			sales.setProblem(issueString);
			sales.getProblem();

		}
		else if(num==4) {
			System.out.println("exit sucessfully !");
			return;
		}
		else {
			System.out.println("Inavlid entry ! ");
		}
		scanner.close();
	}
}
