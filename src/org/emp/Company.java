package org.emp;

public class Company extends Employee {
	
	@Override
	public void empId() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id is 14");
		
	}
	
	@Override
	public void empName(String name) {
		// TODO Auto-generated method stub
		super.empName(name);
	}
	

	public static void main(String[] args) {
		Company c = new Company();
		c.empId();
		c.empName("V");
	}

}
