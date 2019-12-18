package chap04;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = key.nextInt();
		
		if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("양수입니다.");
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}

	}

}
