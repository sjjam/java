package chap04;

import java.util.Scanner;

public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("성별을 입력하세요.");
		int s = key.nextInt();
		System.out.println("나이를 입력하세요.");
		int a = key.nextInt();
		
		if(s==1 | s==3) {
			if(a<=19) {
				System.out.println("청소년남자");
			}else {
				System.out.println("성인남자");
			}
		}else {
			if(a<=19) {
				System.out.println("청소년여자");
			}else {
				System.out.println("성인여자");
			}
			
		}

	}

}
