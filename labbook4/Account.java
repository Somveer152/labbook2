package labbook4;

import java.util.Random;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;


	public void deposit() {
		
	}


	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		
		this.accNum = accNum;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Person getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double num)
	{
		this.setBalance(balance+num);
		
	}
	public void withdraw(double num)
	{
		if(this.balance>=num&&this.balance==500) {
			this.setBalance(balance-num);
	}
		else {
			System.out.println("Account balance is no enough");
		}
		}
	public String toString()
	{
		return this.getBalance()+"\n"+this.getAccNum()+"\n"+getAccHolder().getAge()+"\n"+getAccHolder().getName();
	}

}
