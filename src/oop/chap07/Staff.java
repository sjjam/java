package oop.chap07;

public class Staff extends Person{
/*	private String name;
	private int age;*/
	private String dept;
	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		super(name,age);
		this.dept = dept;
	}/*
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		super.print();
		System.out.println(/*"����: "+getName()+" ����: "+getAge()+*/" �μ�: "+getDept());
	}
}
