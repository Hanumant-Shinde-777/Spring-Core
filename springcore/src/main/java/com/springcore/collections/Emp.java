package com.springcore.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;
public class Emp {
	private String Name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		Name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	
	
	
	
	

}
