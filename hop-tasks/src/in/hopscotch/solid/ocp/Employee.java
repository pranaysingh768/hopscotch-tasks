package in.hopscotch.solid.ocp;

 class Employee {
	
	private IPayClassification salaryType;
	private String name;
	
	
	public IPayClassification getSalaryType() {
		return salaryType;
	}
	
	public void setSalaryType(IPayClassification salaryType) {
		this.salaryType = salaryType;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
