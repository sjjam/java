package chap03;

import java.util.Random;

public class APIExam {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomNum = rand.nextInt();
		System.out.println("������=>"+randomNum);
		
		randomNum = rand.nextInt(100)+1; //0~99������ �����̹Ƿ� +1�ؼ� 1~100����
		System.out.println("������=>"+randomNum);
	}

}
