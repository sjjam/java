package chap04;

import java.util.Scanner;
//if~else���� Scanner
public class IfTest02 {
	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
		//90�̸��̸� "�����"�� ����ϼ���.
		Scanner key = new Scanner(System.in);
		int score = key.nextInt();		
		if(score>=90) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
		
	}
	
}
