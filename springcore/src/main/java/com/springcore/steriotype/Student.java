package com.springcore.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Sambhu")
	private String studentName;
	@Value("Kathmandu")
	private String city;

	@Value("#{numbers}")
	private List<Integer> phone;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Integer> getPhone() {
		return phone;
	}

	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", phone=" + phone + "]";
	}

}
