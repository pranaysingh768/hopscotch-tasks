package in.hopscotch.solid.srp;

public class SRP {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Pranay",24,"SE1");
		
		EmployeePayCalculate employeePayCalculate = new EmployeePayCalculate();
		employeePayCalculate.calculateSalary(employee);
		
		EmployeeReport employeeReport = new EmployeeReport();
		employeeReport.printEmployeeReport(employee, "performanceReport");
		
		SaveEmployeeDetail saveEmployeeDetail = new SaveEmployeeDetail();
		saveEmployeeDetail.saveEmployeeDetails(employee, "insert");
		
	}

}
