package chap03;
//기본형과 참조형 변수의 비교
public class VariableTest {
	public static void main(String[] args) {
		//기본형변수
		int i = 10;
		int j = 10;
		System.out.println("============기본형============");
		if(i==j) {
			System.out.println("기본형 같다.");
		}else {
			System.out.println("기본형 다르다.");
		}
		//참조형변수
		String str1 = new String("java");
		String str2 = new String("java");
		//str1=str2; 이렇게 넣어주면 "참조형같다."라고 뜸 > str2의 값을 str1에 넣어주기 때문 이경우 str1도 str2를 참조하게 됨
		if(str1==str2) {
			System.out.println("참조형같다.");
		}else {
			System.out.println("참조형다르다.");
		}
		//문자열비교 - String클래스 메소드로 처리
		//boolean result = str1.equals(str2);
		if(str1.equals(str2)) {
			System.out.println("문자열같다.");
		}else {
			System.out.println("문자열다르다");
		}
	}
}
