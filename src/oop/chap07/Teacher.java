package oop.chap07;

public class Teacher extends Person{
/*	private String name;
	private int age;*/
	private String subject;
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
/*
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void print() {
		super.print();
		System.out.println(/*"����: "+getName()+" ����: "+getAge()+*/
				" ����: "+getSubject());
	}
}
