package model;

public class Employee {
	
	private String name;
	private int employeeId;
	private String workPosition;
	
	public Employee(String name, int employeeId, String workPosition) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.workPosition = workPosition;
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
	
	

}
