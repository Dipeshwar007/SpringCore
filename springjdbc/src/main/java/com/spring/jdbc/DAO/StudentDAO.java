package com.spring.jdbc.DAO;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDAO {
	public int insert(Student student);

	public int change(Student student);

	public int delete(int studentID);

	public Student getStudent(int studentID);

	public List<Student> getAllStudents();
}
