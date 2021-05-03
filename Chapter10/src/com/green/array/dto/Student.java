package com.green.array.dto;

public class Student extends Member{

	private String major;

	public Student(String name, String id, String password, String major) {
		super(name, id, password);
		this.major=major;
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void work() {
		System.out.println("공부를 합니다.");

	}

	@Override
	public void test() {
		System.out.println("채점을 합니다.");

	}


}
