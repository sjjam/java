package chap05;
//����(shuffle)
public class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0;i<100;i++) {
			int n =(int)(Math.random()*10); // 0~9 ���� �� ���� ���Ƿ� ��´�.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] =tmp; // numArr[0]�� numArr[n]�� ���� ���� �ٲ۴�.
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]);
		}
		
		//////Math.random();
		
		System.out.println();
		int d = (int)(Math.random()*10);
		System.out.println(d);
	}
}
