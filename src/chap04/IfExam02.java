package chap04;

import java.util.Scanner;

public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int s = key.nextInt();
		System.out.println("���̸� �Է��ϼ���.");
		int a = key.nextInt();
		
		if(s==1 | s==3) {
			if(a<=19) {
				System.out.println("û�ҳⳲ��");
			}else {
				System.out.println("���γ���");
			}
		}else {
			if(a<=19) {
				System.out.println("û�ҳ⿩��");
			}else {
				System.out.println("���ο���");
			}
			
		}

	}

}
