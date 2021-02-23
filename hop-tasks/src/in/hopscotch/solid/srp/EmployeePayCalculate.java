package in.hopscotch.solid.srp;

public class EmployeePayCalculate {

		public double calculateSalary(Employee employee) {
			
			String grade = employee.getGrade();
			double salary = 0.0;
			
			if(grade.equalsIgnoreCase("SE1")) {
				
				salary = 50 * 100;
			}
			else if(grade.equalsIgnoreCase("SE2")) {
				
				salary = 50 * 200;
			}
			else {
				
				salary = 50 * 300;
			}
			
			System.out.println("Salary for "+grade+" grade is >>> "+salary);
			
			return salary;
		}
}
