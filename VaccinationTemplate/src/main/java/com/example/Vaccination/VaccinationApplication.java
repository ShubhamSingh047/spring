package com.example.Vaccination;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class VaccinationApplication {

	public static void main(String[] args) {

		/*
		 * You need to complete this application as mentioned in the problem statement
		 * build your own logic and perform the following tasks.
		 * 
		 * Tasks: 1. Fetch context from ApplicationContext.xml and initiate Scanner. 2.
		 * Fetch vaccine and User type choice. 3. Get the required bean from context. 4.
		 * Get the appointment details form user 5. Display the appointment details 6.
		 * Run the loop again to book for another user or else exit.
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome to the vaccination Application !");
			System.out.println("Please choose your vaccine prefernce:-");
			System.out.println("1) Covid \n 2) Polio \n 3) Typhoid \n");

			int vaccine = s.nextInt();

			Vaccine vaccine2;
			TimeAndLocation tandl;

			switch (vaccine) {
			case 1: {
				vaccine2 = (Vaccine) context.getBean("covid");
				System.out.println("Whom do you want to Vaccinate:-");
				System.out.println("1) Father \n 2) Mother \n 3) Self \n 4) Spouse \n");

				int key = s.nextInt();

				User user;

				switch (key) {
				case 1: {
					user = (User) context.getBean("fatherCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 2: {
					user = (User) context.getBean("motherCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter Mother Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 3: {
					user = (User) context.getBean("selfCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter Your Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 4: {
					user = (User) context.getBean("spouseCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter your Spouse Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				default:
					System.out.println("Inavlid input ! ");
				}
				break;
			}
			case 2: {
				vaccine2 = (Vaccine) context.getBean("polio");
				System.out.println("Whom do you want to Vaccinate:-");
				System.out.println("1) Father \n 2) Mother \n 3) Self \n 4) Spouse \n");

				int key = s.nextInt();

				User user;

				switch (key) {
				case 1: {
					user = (User) context.getBean("fatherCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 2: {
					user = (User) context.getBean("motherCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter Mother Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 3: {
					user = (User) context.getBean("selfCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter Your Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 4: {
					user = (User) context.getBean("spouseCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter your Spouse Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				default:
					System.out.println("Inavlid input ! ");
				}
				break;
			}case 3: {
				vaccine2 = (Vaccine) context.getBean("typhoid");
				System.out.println("Whom do you want to Vaccinate:-");
				System.out.println("1) Father \n 2) Mother \n 3) Self \n 4) Spouse \n");

				int key = s.nextInt();

				User user;

				switch (key) {
				case 1: {
					user = (User) context.getBean("fatherCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 2: {
					user = (User) context.getBean("motherCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter Mother Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 3: {
					user = (User) context.getBean("selfCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter Your Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				case 4: {
					user = (User) context.getBean("spouseCovid");
					tandl = (TimeAndLocation) context.getBean("timeAndLocation");
					System.out.println("Please enter your Spouse Deatils");
					System.out.println(
							"Please enter father Deatils \n Name:- \n Age \n Appointment date:-(MM/DD/YY) \n Time(AM/PM):- \n Location:- \n");
					String name = s.next();
					int age = s.nextInt();
					String date = s.next();
					String timeSlot = s.next();
					String location = s.next();

					tandl.setDetails(timeSlot, location, date);
					user.setUserDetails(name, age, tandl);
					user.setAppointment();
					break;
				}
				default:
					System.out.println("Inavlid input ! ");
				}
				break;
			}

			default:
				System.out.println("Inavlid input ! ");
			}

			System.out.println("Do you want to register for someone else \n 1)Yes \n 2)No");
			int n = s.nextInt();
			if (n != 1) {
				System.out.println("Thank you ! \nVisit again !");
				break;
			}
		}

	}
}