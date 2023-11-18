package com.springcore.lifecycle;

import javax.annotation.PostConstruct;

public class Example {
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}
	
	
	
	

	
@PostConstruct
public void Start() {
	System.out.println("Method gone start");
}
 

@PreConstruct
public void End() {
	System.out.println("method goind to die");
}
	
	
	
}
