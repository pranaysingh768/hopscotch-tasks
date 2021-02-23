package in.hopscotch.solid.srp;

public class SaveEmployeeDetail {
	
	public boolean saveEmployeeDetails(Employee employee , String mode) {
		
		if(mode.equalsIgnoreCase("Insert")) {
			
			System.out.println("Insert the value in DB");
			return true;
		}
		
		else {
			
			System.out.println("Update the value in DB");
			return false;
		}
	}
}
