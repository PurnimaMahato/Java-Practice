package com.keyword.example;

public class StaticVariable {
	static String Company="TCS";//Static Variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee(100,"Purnima");
		obj1.display();
		Employee obj2=new Employee(101,"Rahul");
		obj2.display();
		Manager obj3=new Manager(25,"Deb");
		obj3.display();
		Manager obj4=new Manager(26,"Somu");
		obj4.display();

	}

}


