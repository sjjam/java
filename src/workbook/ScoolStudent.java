package workbook;

public class ScoolStudent {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public ScoolStudent() {
		
	}

	public ScoolStudent(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeght() {
		return weight;
	}
	
	public double getAgeAvg() {
		double ageavg;
		return ageavg = getAge()/4;
	}
	
	public double getHeightAvg() {
		double heightavg;
		return heightavg = getHeightAvg()/4;
	}
	
	public double getWeightAvg() {
		double weightavg;
		return weightavg = getWeightAvg()/4;
	}
	
	public void print() {
		System.out.println(name+"\t"+age+"\t"+height+"\t"+weight);
	}
	
}
