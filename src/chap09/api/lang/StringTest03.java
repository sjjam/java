package chap09.api.lang;
//String클래스의 기본 메소드와 String클래스의 특징
//=> 문자열처리 메소드를 자주 호출하거나 +연산자로 문자열을 연결하는 작업이 많은 경우
//   String을 사용하지 않고 StringBuffer or StringBuilder를 이용한다.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		
		//원본변환
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());//(전체 대문자로)
		
		System.out.println("원본데이터:"+str1);
		
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());//(전체 소문자로)
		System.out.println("str1.substring(2)=>"+str1.substring(2));//(2번라인부터 출력)
		System.out.println("str1.substring(2, 8)=>"+str1.substring(2, 8));//(2부터 8앞까지 출력)
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));//(a찾아서 A로 바꿈)
		//(원본을 변경하는 것이 아니고 원본을 읽어서 또다른 String객체를 만듬)
		System.out.println("원본데이터:"+str1);
		//(문자열 조작이 빈번한 곳에서는 String 사용하지 말아라 > StringBuffer사용)
		//(StringBuffer StringBuilder 차이는 StringBuffer에는 동시접속에 대해 처리되어 있음)
	}

}
