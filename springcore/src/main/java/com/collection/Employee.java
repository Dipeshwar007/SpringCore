package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String employeeName;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> course;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, List<String> phone, Set<String> address, Map<String, String> course) {
		super();
		this.employeeName = employeeName;
		this.phone = phone;
		this.address = address;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", phone=" + phone + ", address=" + address + ", course="
				+ course + "]";
	}
}
