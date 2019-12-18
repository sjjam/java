package chap04;
import java.util.Scanner;
//입력받은 구구단을 출력
public class ForExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("출력 단:");
		int dan = key.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(dan +"*" + i +"="+dan*i);
		}
	}
}
