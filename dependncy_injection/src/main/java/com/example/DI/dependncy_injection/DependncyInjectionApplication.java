package com.example.DI.dependncy_injection;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependncyInjectionApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependncyInjectionApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//		Car family=(Car) context.getBean("familyCar");
//		Car sports=(Car) context.getBean("sportsCar");
//		Car truck=(Car) context.getBean("truck");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Hi enter any name !");
		String name =s.nextLine();
		
		System.out.println("Please choose from following Car");
		System.out.println("1). Family Car !");
		System.out.println("2). Sports Car !");
		System.out.println("3). truck !");
		int type=s.nextInt();
		
		Car car=null;
		
		switch (type) {
		case 1: {
			car=(Car) context.getBean("familyCar");
			break;
		}
		case 2:{
			car=(Car) context.getBean("sportsCar");
			break;
		}
		case 3: {
			car=(Car) context.getBean("truck");
			break;
		}
		default:
			System.out.println("wrong Option!");
		}
		car.setOwnerName(name);
		
		System.out.println(car.getOwnerName()+" owns "+car.getInfo());
		
	}

}
