package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		Student student = new Student(156, "Nikolas Tesla", "Great bretan");
//       int r=studentDao.insert(student);
//       System.out.println("Completed : " +r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Launcing The Screen..");
		boolean go = true;
		while (go) {
			System.out.println("Launch 1 for add new Student");
			System.out.println("Lanuch 2 for Display");
			System.out.println("launch 3 get Single Entry");
			System.out.println("Launch 4 for delete");
			System.out.println("Launch 5 Update");
			System.out.println("Launch 6 for Exit");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// add new one
					break;

				case 2:
					// Display
					break;

				case 3:
					// Single Entry
					break;

				case 4:
					// Delete Entry
					break;

				case 5:
					// Update
					break;

				case 6:
					// Exit
				go = false;
					break;

				}

			} catch (Exception e) {
				System.out.println("Warning!! Invalid Input");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Succufully Lanunched...");
	}
}

//49