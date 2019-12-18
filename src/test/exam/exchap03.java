package test.exam;

public class exchap03 {

	public static void main(String[] args) {
		//연습3-2
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (123/10 != 0 ? 123/10+1 : 123/10); // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		//연습3-3
		int num = 10;
		System.out.println(num == 0 ? "0" : num > 0 ? "양수" : "음수");
		//연습3-4
		int num1 = 456;
		System.out.println(num1%100 == 0 ? +num1 : num1-(num1%100));
	}

}
