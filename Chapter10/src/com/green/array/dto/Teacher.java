package com.green.array.dto;

public class Teacher extends Member{
	
	private String subject;
	
	public Teacher (String name, String id, String password, String subject) {
		super(name, id, password);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void work() {
		System.out.println("강의를 합니다.");
		
	}

	@Override
	public void test() {
		System.out.println("채점을 합니다.");
		
	}
	
	
	
}
