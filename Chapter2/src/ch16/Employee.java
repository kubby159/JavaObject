package ch16;

public class Employee {

	public static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;

	public Employee() {
		// serialNum 은 모든 메모리에게 공통적으로 공유되고 있는 값임.
		// 그러므로 emplyeeId에 할당해서 각각 다른 값을 가질 수 있게 한다.

		serialNum++;
		employeeId = serialNum;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
