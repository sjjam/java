package oop.chaop06;

public class Student {
	private String name;
	private int age;
	private int korean;
	private int english;
	private int math;
	private int science;
	//(source > Generate getters and setters.. 해주면 알아서 만들어줌)
	public Student() {
		
	}
	
	public Student(String name, int age, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	
	public String getName() {
		return name;
	}
/*
	public void setName(String name) {
		this.name = name;
	}
*/
	public int getKorean() {
		return korean;
	}
/*
	public void setKorean(int korean) {
		this.korean = korean;
	}
*/
	public int getEnglish() {
		return english;
	}
/*
	public void setEnglish(int english) {
		this.english = english;
	}
*/
	public int getMath() {
		return math;
	}
/*
	public void setMath(int math) {
		this.math = math;
	}
*/
	public int getScience() {
		return science;
	}
/*
	public void setScience(int science) {
		this.science = science;
	}
*/
	/*
	public void setName(String name) {
		this.name = name;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public String getName() {
		return this.name;
	}
	public int getKorean() {
		return this.korean;
	}
	public int getEnglish() {
		return this.english;
	}
	public int getMath() {
		return this.math;
	}
	public int getScience() {
		return this.science;
	}
	*/
	public double getAvg() {
		double avg = (double)(korean+english+math+science)/4;
		return avg;
	}
	
	public String getGrade() {
		double avg = getAvg();
		String grade = "";//(String 변수 초기화)
		if(avg<=100 & avg>=90) {
			grade = "A학점";
		}else if(avg<90 & avg>=70) {
			grade = "B학점";
		}else if(avg<70 & avg>=50) {
			grade = "C학점";
		}else if(avg<50 & avg>=30) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		return grade;
	}
	public void print() {
		System.out.println(getName()+" 평균:"+getAvg()+" 학점:"+getGrade());
	}

}
