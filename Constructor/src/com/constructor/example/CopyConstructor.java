package com.constructor.example;

public class CopyConstructor {
	String name;
	int id;
	//parameterized constructor
	CopyConstructor(String name,int id){
		this.name=name;
		this.id=id;
		System.out.println("By parametarized constructor");
		
	}
	//copy constructor
	CopyConstructor(CopyConstructor CopyObj){
		this.name=CopyObj.name;
		this.id=CopyObj.id;
		System.out.println("By copy constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor obj1 = new CopyConstructor("Purnima" , 27);
		System.out.println("Name= "+obj1.name+", id="+obj1.id);
		CopyConstructor obj2 = new CopyConstructor( obj1);
		System.out.println("Name= "+obj2.name+", id="+obj2.id);

	}

}
