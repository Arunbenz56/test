package com.testing;

public class Employee {
	//count of arguments
	public void empDetails(String name) {
		System.out.println("Employee Name is "+ name);
	}
	public void empDetails(String name,long phone) {
		System.out.println("Employee name is "+name);
		System.out.println("Employee phone number is "+phone);
	}
	//data type of arguments
	public void empDetails(int age) {
		System.out.println("Age is "+age);
	}
	public void empDetails(boolean status) {
		System.out.println("Status of the employee is "+status);
	}
	//order of arguments
	public void empDetails(String project,String manager) {
		System.out.println("managers name is "+manager);
		System.out.println("project name is "+project);
	}
	public void empDetails(Float salary,String email) {
		System.out.println("email id is "+email);
		System.out.println("salary is "+salary);
	}
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.empDetails("Benz");
		employee.empDetails("Arun", 8754926280l);
		employee.empDetails(27);
		employee.empDetails(true);
		employee.empDetails("Light in the box", "vishal");
		employee.empDetails(23245.65f, "arunbenz298@gmail.com");
	}
}
