package model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
	
	private String name;
	private int employeeId;
	private String workPosition;
	private double interestRate;
	
	private List<Client> client = new ArrayList<>();
	

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	public List<Banker> getBanker() {
		return banker;
	}

	public void setBanker(List<Banker> banker) {
		this.banker = banker;
	}

	private List<Banker> banker = new ArrayList<>();
	
	public Manager(String name, int employeeId, String workPosition) {
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
		return "Manager [name=" + name + ", employeeId=" + employeeId + ", workPosition=" + workPosition
				+ ", interestRate=" + interestRate + ", client=" + client + ", banker=" + banker
				+ ", getInterestRate()=" + getInterestRate() + ", getClient()=" + getClient() + ", getBanker()="
				+ getBanker() + ", getName()=" + getName() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getWorkPosition()=" + getWorkPosition() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
