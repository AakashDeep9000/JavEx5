package com.stackroute.exe4;

public class Student {
	@Override
	public String toString() {
		return "Student [name=" + name + ", iD=" + iD + ", age=" + age + "]";
	}
	private String name;
	private int iD;
	private int age;
	
	public Student(String name, int iD, int age) {
		super();
		this.name = name;
		this.iD = iD;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
