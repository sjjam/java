package chap09.api.lang;

public class Person {
	String name;
	int age;
	String addr;
	public Person() {
		
	}
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getAddr()=" + getAddr() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	/*
	public String toString() {
		return this.name+","+this.age+","+this.addr;
	}
	*/
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
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
