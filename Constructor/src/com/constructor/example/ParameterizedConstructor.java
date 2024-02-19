package com.constructor.example;

public class ParameterizedConstructor {
	//parameterized constructor
	ParameterizedConstructor(double d){
		System.out.println("1 argument .");
		System.out.println(d);
	}
	//parameterized constructor
	ParameterizedConstructor(int a , int b){
		System.out.println("2 argument .");
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		ParameterizedConstructor obj1 = new ParameterizedConstructor(5.5);
		ParameterizedConstructor obj2 = new ParameterizedConstructor(5,8);
		

	}

}
