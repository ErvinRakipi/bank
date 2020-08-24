package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccount {

	private String name;
	private String surname;
	private int balance;
	private int accountNumber;
	private String accountPassword;
	private String type;
	private List<BankBranch> branch = new ArrayList<>();
	private AccountOperations[] operations;
	private double interestRate;
	
	// private static int lastAccountNumber = 0;
	
	public BankAccount(Client client, int initialBalance, int accountNumber, String accountPassword, String type)
	  {
	    this.name = client.getName();
	    this.surname = client.getSurname();
	    this.accountNumber = client.getAccountNumber();
	    this.accountPassword = client.getAccountPassword();
	    this.balance = initialBalance;
	    this.type = type;

	    
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<BankBranch> getBranch() {
		return branch;
	}

	public void setBranch(List<BankBranch> branch) {
		this.branch = branch;
	}

	public AccountOperations[] getOperations() {
		return operations;
	}

	public void setOperations(AccountOperations[] operations) {
		this.operations = operations;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", surname=" + surname + ", balance=" + balance + ", accountNumber="
				+ accountNumber + ", accountPassword=" + accountPassword + ", type=" + type + ", branch=" + branch
				+ ", operations=" + Arrays.toString(operations) + ", interestRate=" + interestRate + ", getName()="
				+ getName() + ", getSurname()=" + getSurname() + ", getBalance()=" + getBalance()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getAccountPassword()=" + getAccountPassword()
				+ ", getType()=" + getType() + ", getBranch()=" + getBranch() + ", getOperations()="
				+ Arrays.toString(getOperations()) + ", getInterestRate()=" + getInterestRate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
