package com.example.SocailMedia.Socail.Media;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		System.out.println("Social Media App Started !");
		Scanner s=new Scanner(System.in);
		
		while(true) {
			
			SimplePostList sp=(SimplePostList) context.getBean("simplePostList");
			
			System.out.println("What you want to do"
					+ "\n1.make a post"
					+ "\n2.Show All post"
					+ "\n3.Exit");
			int choice=s.nextInt();
			switch (choice) {
			case 1: {
				Post post=(Post) context.getBean("simplePost");
				s.nextLine();
				System.out.println("Enter new post !");
				String newPost=s.nextLine();
				post.setMassage(newPost);
				sp.setPost(post);
				break;
			}
			case 2: {
				int i=0;
				System.out.println(sp.size());
				while(i!=sp.size()) {
					System.out.println(i+1+")"+sp.list.get(i).getMessage());
					i++;
				}
				break;
			}
			case 3: {
				System.out.println("Thank you !");
				System.exit(0);
			}
			default:
				System.out.print("Unexpected choice: " + choice);
				break;
			}
		}
	}

}
