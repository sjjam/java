package workbook;

public class ScoolStudentTest {
	public static void main(String[] args) {
		ScoolStudent student = new ScoolStudent();
		ScoolStudent studentArray[] = new ScoolStudent[3];
		studentArray[0] = new ScoolStudent("ȫ�浿",15,171,81);
		studentArray[1] = new ScoolStudent("�ѻ��",13,183,72);
		studentArray[2] = new ScoolStudent("�Ӱ���",16,175,65);
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"������");
		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i].print();
		}
		/*
		System.out.println("������ ���: "+student.getAgeAvg()+"\n"
				+ "������ ���: "+student.getHeightAvg()+"\n"
				+ "�������� ���: "+student.getWeightAvg());*/

	}

}
