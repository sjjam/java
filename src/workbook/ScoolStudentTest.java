package workbook;

public class ScoolStudentTest {
	public static void main(String[] args) {
		ScoolStudent student = new ScoolStudent();
		ScoolStudent studentArray[] = new ScoolStudent[3];
		studentArray[0] = new ScoolStudent("홍길동",15,171,81);
		studentArray[1] = new ScoolStudent("한사람",13,183,72);
		studentArray[2] = new ScoolStudent("임걱정",16,175,65);
		System.out.println("이름"+"\t"+"나이"+"\t"+"신장"+"\t"+"몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i].print();
		}
		/*
		System.out.println("나이의 평균: "+student.getAgeAvg()+"\n"
				+ "신장의 평균: "+student.getHeightAvg()+"\n"
				+ "몸무게의 평균: "+student.getWeightAvg());*/

	}

}
