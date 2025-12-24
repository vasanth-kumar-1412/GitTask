package org.emp;

public abstract class Employee {
	//contains both abstract and non abstract methods
	
	//abstract method
	public abstract void empId();
	
	//non abstract method 
	public void empName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
	}

	public void empName() {
		// TODO Auto-generated method stub
		
	}

	

}
