package api.util;

import java.util.Scanner;

//Scanner클래스(API)의 사용방법
//=> 프로그램 실행 중간에 값을 입력받을 수 있는 기능들을 제공하는 클래스
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in); //표준입력된 값을 가지고 있어야 하므로 ()안에 System.in
		System.out.println("문자열을 입력하세요:");
		String data = key.next(); //스페이스바나 Enter 입력전까지의 문자 출력
		System.out.println("키보드로 입력받은 문자열"+data);
		System.out.print("숫자를 입력하세요:");
		int intVal = key.nextInt();
		System.out.println("입력받은 숫자=>"+intVal);
	}
}
