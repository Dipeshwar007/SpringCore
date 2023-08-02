package com.spring.jdbc.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDAOimpl implements StudentDAO {
	private JdbcTemplate jdbctemplate;

	@Override
	public int insert(Student student) {
		String query = "INSERT INTO studentinfo (id,name,city) VALUES (?,?,?)";

		int r = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		String query = "UPDATE studentinfo SET name=?,city=? WHERE id=?";
		int r = this.jdbctemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	@Override
	public int delete(int studentID) {
		String query = "DELETE FROM studentinfo WHERE id=?";
		int delete = this.jdbctemplate.update(query, studentID);
		return delete;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public Student getStudent(int studentID) {
		String query = "SELECT * FROM studentinfo WHERE id=?";
		RowMapper<Student> rowmapper = new RowmapperImpl();
		Student queryForObject = this.jdbctemplate.queryForObject(query, rowmapper, studentID);
		return queryForObject;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "SELECT * FROM studentinfo";
		
		List<Student> student = this.jdbctemplate.query(query, new RowmapperImpl());
		return student;
	}

}
