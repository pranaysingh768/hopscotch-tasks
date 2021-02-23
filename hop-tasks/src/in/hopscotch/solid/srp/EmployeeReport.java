package in.hopscotch.solid.srp;

public class EmployeeReport {
	
	public void printEmployeeReport(Employee employee , String reportType) {
		
		String employeeName = employee.getName();
		
		if(reportType.equalsIgnoreCase("salaryReport")) {
			
			System.out.println("Print salary report of "+employeeName);
		}
		
		else if(reportType.equalsIgnoreCase("performanceReport")) {
			
			System.out.println("Print performance report of "+employeeName);
		}
	}
}
