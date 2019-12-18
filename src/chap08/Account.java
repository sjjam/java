package chap08;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account(){
		
	}
	
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}


	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance*interestRate/100;
	}
	public void deposit(double money) throws Exception{
		if(money<0) {
			throw new Exception("�Ա� �ݾ��� 0���� �����ϴ�");
		}
		balance = balance+money;
	}
	public void withdraw(double money) throws Exception{
		if(money<0 | balance<money) {
			throw new Exception();
		}
		balance = balance-money;
	}
}















