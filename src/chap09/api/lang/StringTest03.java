package chap09.api.lang;
//StringŬ������ �⺻ �޼ҵ�� StringŬ������ Ư¡
//=> ���ڿ�ó�� �޼ҵ带 ���� ȣ���ϰų� +�����ڷ� ���ڿ��� �����ϴ� �۾��� ���� ���
//   String�� ������� �ʰ� StringBuffer or StringBuilder�� �̿��Ѵ�.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		
		//������ȯ
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());//(��ü �빮�ڷ�)
		
		System.out.println("����������:"+str1);
		
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());//(��ü �ҹ��ڷ�)
		System.out.println("str1.substring(2)=>"+str1.substring(2));//(2�����κ��� ���)
		System.out.println("str1.substring(2, 8)=>"+str1.substring(2, 8));//(2���� 8�ձ��� ���)
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));//(aã�Ƽ� A�� �ٲ�)
		//(������ �����ϴ� ���� �ƴϰ� ������ �о �Ǵٸ� String��ü�� ����)
		System.out.println("����������:"+str1);
		//(���ڿ� ������ ����� �������� String ������� ���ƶ� > StringBuffer���)
		//(StringBuffer StringBuilder ���̴� StringBuffer���� �������ӿ� ���� ó���Ǿ� ����)
	}

}
