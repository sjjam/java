package test.exam;

public class exchap03 {

	public static void main(String[] args) {
		//����3-2
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = (123/10 != 0 ? 123/10+1 : 123/10); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		//����3-3
		int num = 10;
		System.out.println(num == 0 ? "0" : num > 0 ? "���" : "����");
		//����3-4
		int num1 = 456;
		System.out.println(num1%100 == 0 ? +num1 : num1-(num1%100));
	}

}
