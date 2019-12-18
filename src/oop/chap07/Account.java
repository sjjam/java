package oop.chap07;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	private double interestRate;

	public Account() {
		
	}	
	public Account(String account, int balance, String ownerName) {
		super();
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getAccount() {
		return account;
	}
/*
	public void setAccount(String account) {
		this.account = account;
	}
*/
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}
/*
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
*/
	public double calculateInterest() {
		return getBalance()*interestRate/100;
		
	}
	
	public void deposit(int money) {
		this.balance = getBalance() + money;
		
	}
	
	public void withdraw(int money) {
		this.balance = getBalance() - money;
	}

}
