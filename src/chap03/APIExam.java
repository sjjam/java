package chap03;

import java.util.Random;

public class APIExam {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomNum = rand.nextInt();
		System.out.println("랜덤값=>"+randomNum);
		
		randomNum = rand.nextInt(100)+1; //0~99까지의 범위이므로 +1해서 1~100범위
		System.out.println("랜덤값=>"+randomNum);
	}

}
