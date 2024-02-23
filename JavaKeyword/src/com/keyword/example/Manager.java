package com.keyword.example;

public class Manager {
	int MangId;
	String MangName;
	
	
	Manager(int MangId, String MangName ){
		this.MangId = MangId;
		this.MangName = MangName;
	}
	
	void display() {
		System.out.println("Manager Id=" + MangId + ", Name=" + MangName + ", Company name=" + StaticVariable.Company);
		//'Company' is Static variable which declared in StaticVariable class
	}

}
