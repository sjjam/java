package oop.chaop06;
//PersonŬ������ ����ϴ� Ŭ����
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("�嵿��","�����",45);
		/*
		p1.setName("�嵿��");
		p1.setAddr("�����");
		p1.setAge(45);//age������ private���� ����Ǿ� �����Ƿ� 
					  //���� ��Ű���� Ŭ�������������� �� ����.
		*/
		System.out.println("����:"+p1.getName());
		System.out.println("�ּ�:"+p1.getAddr());
		System.out.println("����:"+p1.getAge());
		
		Person p2 = new Person("�輭��","��õ��",25);
		/*
		p2.setName("�輭��");
		p2.setAddr("��õ��");
		p2.setAge(25);
		*/
		System.out.println("����:"+p2.getName());
		System.out.println("�ּ�:"+p2.getAddr());
		System.out.println("����:"+p2.getAge());
		
	}
}
