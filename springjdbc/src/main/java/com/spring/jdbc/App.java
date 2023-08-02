package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.DAO.StudentDAO;
import com.spring.jdbc.entities.Student;


public class App {
	public static void main(String[] args) {
		System.out.println("System is starting...........!");

		// Require Jdbc template
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		StudentDAO studentDao = context.getBean("studentDao", StudentDAO.class);

		// generating student
		Student student = new Student();
		
		
		// SELECT All USers
		
		List<Student> allStudents = studentDao.getAllStudents();
		for(Student s: allStudents)
		{
			System.out.println(s);
			System.out.println(s.getId());
		}
		
		
		// SELECT single object from database 
		
//		Student student2 = studentDao.getStudent(432);
		
//		System.out.println(student2);

		// DELETE Student

		/*
		 int delete = studentDao.delete(666); System.out.println("One data deleted: "
		  + delete);
		 */

		// UPDATE a student

		/*
		 student.setId(432); student.setName("Samual Raj");
		 student.setCity("Lakhuno");
		  
		  int change = studentDao.change(student);
		  System.out.println("Data updated "+change);
		 */

		// INSERT data using loose copuling

		
//		 student.setId(666); student.setName("Samir"); student.setCity("Bhaktapur");
//		  
//		 int result = studentDao.insert(student);
//		  
//		 System.out.println(result);
		 

		// INSERT Query with plain jdbc
		/*
		  String query = "INSERT INTO studentinfo (id,name,city) VALUES (?,?,?)";
		  
		  // Firing query
		  
		  int result = template.update(query, 432, "Hari Om", "Kathmandu");
		  
		  System.out.println(result);
		 */
	}
}
