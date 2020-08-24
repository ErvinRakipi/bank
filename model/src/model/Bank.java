package model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

private String name;
	
	private List<BankBranch> branch = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BankBranch> getBranch() {
		return branch;
	}

	public void setBranch(List<BankBranch> branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", branch=" + branch + ", getName()=" + getName() + ", getBranch()=" + getBranch()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
