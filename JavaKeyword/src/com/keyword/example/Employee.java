package com.keyword.example;

public class Employee {
	int EmpId;
	String EmpName;
	
	 Employee(int EmpId, String EmpName ){
		this.EmpId = EmpId;
		this.EmpName = EmpName;
	}
	
	void display() {
		System.out.println("Employee Id=" + EmpId + ", Name=" + EmpName + ", Company name=" + StaticVariable.Company);
		//'Company' is Static variable which declared in StaticVariable class
	}

}

