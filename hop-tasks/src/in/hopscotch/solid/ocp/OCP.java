package in.hopscotch.solid.ocp;

public class OCP {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Pranay");
		
		Commision commision = new Commision();
		employee.setSalaryType(commision);
		
		PayRoll payRoll = new PayRoll();
		payRoll.calculateSalary(employee);
	}

}
