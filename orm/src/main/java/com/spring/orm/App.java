package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.Studentdao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Studentdao studentDao = context.getBean("studentDao", Studentdao.class);

//		Student student = new Student(446, "haryaram", "Balkot");
//
//		int insert = studentDao.insert(student);
//
//		System.out.println(insert);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for display all students");
			System.out.println("PRESS 3 for get detail of single student");
			System.out.println("PRESS 4 for delete students");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for exit");

			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					// add new Student
					int userID = 0;
					String userName;
					String City;
					// Create a Scanner object

					System.out.println("Enter Id: ");
					try {
						userID = Integer.parseInt(myObj.nextLine());
						System.out.println("Enter username: ");
						userName = myObj.nextLine();

						System.out.println("Enter City: ");
						City = myObj.nextLine();

						Student student = new Student(userID, userName, City);
						studentDao.insert(student);
						System.out.println("Data Inserted Succcesfully");
					} catch (Exception e) {
						System.out.println("please enter a Integer value..!");
						System.out.println(e.getMessage());
					}

					break;

				case 2:
					// display all student
					List<Student> allStudent = studentDao.getAllStudent();
					System.out.println("ID\tName\tCity\n------------------------------");
					for (Student s : allStudent) {
						System.out.println(s.getStudentId() + "\t" + s.getName() + "\t" + s.getCity());
					}
					System.out.println("\n");
					break;

				case 3:
					// get details of single student
					System.out.println("Enter Id to find student: ");
					try {
						userID = Integer.parseInt(myObj.nextLine());

						Student student = studentDao.getStudent(userID);
						System.out.println("ID\tName\tCity\n------------------------------");
						System.out
								.println(student.getStudentId() + "\t" + student.getName() + "\t" + student.getCity());
						System.out.println("\n");
					} catch (Exception e) {
						System.out.println("please enter a Integer value..!");
					}
					break;

				case 4:
					// delete student
					System.out.println("Enter Id to delete student: ");
					try {
						userID = Integer.parseInt(myObj.nextLine());
						studentDao.deleteStudent(userID);
						System.out.println("Data Deleted Successfully.");
					} catch (Exception e) {
						System.out.println("please enter a Integer value..!");
						System.out.println(e.getMessage());
					}
					break;

				case 5:
					// update student
					System.out.println("Enter Id: ");
					try {
						userID = Integer.parseInt(myObj.nextLine());
						System.out.println("Enter New UserName: ");
						userName = myObj.nextLine();

						System.out.println("Enter New City: ");
						City = myObj.nextLine();

						Student student = new Student(userID, userName, City);
						studentDao.updateStudent(student);
						System.out.println("Data Updated Succcesfully");
					} catch (Exception e) {
						System.out.println("please enter a Integer value..!");
						System.out.println(e.getMessage());
					}
					break;

				case 6:
					go = false;
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid input try with another one !!");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thanks For using My Application");
	}
}