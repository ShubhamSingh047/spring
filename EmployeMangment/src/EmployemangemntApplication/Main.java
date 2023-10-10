package EmployemangemntApplication;

import java.util.Scanner;

public class Main {
	EmployeServices services = new EmployeServices();
	static boolean ordering = true;

	public static void menu() {
		System.out.println("wlecome to Employe Mangment Services" + "\n1.Add Employe " + "\n2.View Employe"
				+ "\n3.Update Employe" + "\n4.Delet Employe" + "\n5.View All Employe" + "\n6.Exit");
	}

	public static void main(String[] args) {
		menu();
		Scanner s = new Scanner(System.in);
		
		while (ordering) {
			int key = s.nextInt();
			switch (key) {
			case 1: {
				System.out.println("Add Employe");
				break;
			}
			case 2: {
				System.out.println("View Employe");
				break;
			}
			case 3: {
				System.out.println("Update Employe");
				break;
			}
			case 4: {
				System.out.println("Delet Employe");
				break;
			}
			case 5: {
				System.out.println("View All Employe");
				break;
			}
			case 6: {
				System.out.println("Thank you!");
				System.exit(0);
				break;
			}
			default:
				System.out.print("Unexpected Key Pressed: Please slect from 1-6" + key);
			}
		}
	}

}
