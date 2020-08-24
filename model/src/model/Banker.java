package model;

import java.util.ArrayList;
import java.util.List;

public class Banker extends Employee{

	private String name;
	private int employeeId;
	private String workPosition;
	private double interestRate;
	
	private List<BankAccount> bankAccount = new ArrayList<>();
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public List<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(List<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Banker(String name, int employeeId, String workPosition) {
		super(name, employeeId, workPosition);
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getWorkPosition() {
		return workPosition;
	}

	public void setWorkPosition(String workPosition) {
		this.workPosition = workPosition;
	}

	@Override
	public String toString() {
		return "Banker [name=" + name + ", employeeId=" + employeeId + ", workPosition=" + workPosition
				+ ", interestRate=" + interestRate + ", bankAccount=" + bankAccount + ", getInterestRate()="
				+ getInterestRate() + ", getBankAccount()=" + getBankAccount() + ", getName()=" + getName()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getWorkPosition()=" + getWorkPosition() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
