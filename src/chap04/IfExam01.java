package chap04;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = key.nextInt();
		
		if(num<0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("����Դϴ�.");
			if(num%2==0) {
				System.out.println("¦���Դϴ�.");
			}else {
				System.out.println("Ȧ���Դϴ�.");
			}
		}

	}

}
