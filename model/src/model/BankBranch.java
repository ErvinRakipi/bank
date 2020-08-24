package model;

import java.util.ArrayList;

public class BankBranch {
	
	private String city;
	private Employee banker;
	private Employee manager;
	private ArrayList<BankAccount> bankAccount;
	
	public BankBranch()
	  {
	      this.bankAccount = new ArrayList<BankAccount>();
	  }

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}
	public void setName(String city) {
		this.city = city;
	}
	
	public Employee getBanker() {
		return banker;
	}

	public void setBanker(Employee banker) {
		this.banker = banker;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public ArrayList<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBranch(ArrayList<BankAccount> branch) {
		this.bankAccount = branch;
	}
	
	@Override
	public String toString() {
		return "BankBranch [city=" + city + ", banker=" + banker + ", manager=" + manager + ", bankAccount=" + bankAccount
				+ ", getCity()=" + getCity() + ", getBanker()=" + getBanker() + ", getManager()=" + getManager()
				+ ", getBranch()=" + getBankAccount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
 }

