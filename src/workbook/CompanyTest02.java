package workbook;

public class CompanyTest02 {
	public static void main(String[] args) {
		//Company�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ�
		//�ڵ�casting�� �ȴ�.
		int salary = Integer.parseInt(args[0]);
		Company company = new Company(salary);
		System.out.println("�� �⺻�� ��: "+company.getIncome()+" ����: "+company.getAfterTaxIncome());
		System.out.println("�� ���ʽ� ��: "+company.getBonus()+" ����: "+company.getAfterTaxBonus());
		System.out.println("�� ���޾� ��: "+(company.getAfterTaxBonus()+company.getAfterTaxIncome()));
	}

}
