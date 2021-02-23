package in.hopscotch.solid.ocp;

public class PayRoll {
	
	public void calculateSalary(Employee employee) {
		
		employee.getSalaryType().calculateSalary();
	}
}
