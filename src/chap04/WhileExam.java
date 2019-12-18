package chap04;
//ForExam03.java¸¦ while¹®À¸·Î º¯°æÇÏ±â
public class WhileExam {
	public static void main(String[] args) {
		int i=1;
		int sumVal = 0;//ÃÑÇÕ
		int evenSumVal = 0;//Â¦¼öÇÕ
		int oddSumVal = 0;//È¦¼öÇÕ
		while(i<=100) {
			sumVal = sumVal + i;
			if(i%2==0) {
				evenSumVal = evenSumVal+i;
			}else {
				oddSumVal = oddSumVal+i;
			}
			i++;
		}
		System.out.println("ÃÑÇÕ:"+sumVal);
		System.out.println("Â¦¼öÇÕ:"+evenSumVal);
		System.out.println("È¦¼öÇÕ:"+oddSumVal);
	}
}
