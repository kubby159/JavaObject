package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("�̼���");

		System.out.println(Employee.getSerialNum());

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("������");

		System.out.println(employeeKim.getEmployeeName() + "���� �����" + employeeKim.getEmployeeId() + "�� �Դϴ�.");
		System.out.println(employeeLee.getEmployeeName() + "���� �����" + employeeLee.getEmployeeId() + "�� �Դϴ�.");

	}

}
