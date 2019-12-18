package workbook;

public class Company {
	private double salary;//기본급
	private double annualIncome;//년소득
	private double afterTaxAnnualIncome;//세금 공제 후 년소득의 합
	private double bonus;//보너스
	private double afterTaxBonus;//세금 공제 후 년보너스의 합
	
	public Company() {
		
	}
	public Company(double salary) {
		this.salary = salary;
	}
	
	public double getIncome() {
		annualIncome = salary*12;
		return annualIncome;
	}
	
	public double getAfterTaxIncome() {
		afterTaxAnnualIncome = getIncome()*0.9;
		return afterTaxAnnualIncome;
	}
	
	public double getBonus() {
		bonus = (salary*0.2)*4;
		return bonus;
	}
	
	public double getAfterTaxBonus() {
		afterTaxBonus = getBonus()*(1-0.055);
		return afterTaxBonus;
	}

}
